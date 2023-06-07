package com.carapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.carapp.exception.CarNotFoundException;
import com.carapp.model.Car;
import com.carapp.repository.ICarRepository;

@Service
public class CarServiceImpl implements ICarService {
	ICarRepository carRepository;

	public CarServiceImpl(ICarRepository carRepository) {
		super();
		this.carRepository = carRepository;
	}

	@Override
	public void addCar(Car Car) {
		carRepository.addCar(Car);
	}

	@Override
	public void updateCar(int CarId, int carAge) {
		carRepository.updateCar(CarId, carAge);
	}

	@Override
	public void deleteCar(int CarId) {
		carRepository.deleteCar(CarId);
	}

	@Override
	public List<Car> getAll() {
		return carRepository.findAll();
	}

	@Override
	public Car getById(int CarId) {
		return carRepository.findById(CarId);
	}

	@Override
	public Car getByCarAge(int carAge) {
		return carRepository.findByCarAge(carAge);
	}

	@Override
	public List<Car> getByModelAndBrandAndCity(String model, String brand, String city) {
		List<Car> cars = carRepository.findByModelAndBrandAndCity(model, brand, city);
		if (cars.isEmpty())
			throw new CarNotFoundException();
		return cars;
	}

	@Override
	public List<Car> getByPrice(double costPerHour) {
		List<Car> cars = carRepository.findByPrice(costPerHour);
		if (cars.isEmpty())
			throw new CarNotFoundException();
		return cars;
	}

	@Override
	public List<Car> getByFuelTypeAndModelAndTransmission(String fuelType, String model, String transmission) {
		List<Car> cars = carRepository.findByFuelTypeAndModelAndTransmission(fuelType, model, transmission);
		if (cars.isEmpty())
			throw new CarNotFoundException();
		return cars;
	}

	@Override
	public List<Car> getByModelAndNoOfSeats(String model, int noOfSeats) {
		List<Car> cars = carRepository.findByModelAndNoOfSeats(model, noOfSeats);
		if (cars.isEmpty())
			throw new CarNotFoundException();
		return cars;
	}

}
