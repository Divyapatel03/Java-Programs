package com.carapp.repository;

import java.util.List;

import com.carapp.exception.CarNotFoundException;
import com.carapp.model.Car;

public interface ICarRepository {
	void addCar(Car Car);

	void updateCar(int CarId, int carAge);

	void deleteCar(int CarId);

	List<Car> findAll();

	Car findById(int CarId) throws CarNotFoundException;

	Car findByCarAge(int carAge) throws CarNotFoundException;

	List<Car> findByModelAndBrandAndCity(String model, String brand, String city) throws CarNotFoundException;

	List<Car> findByPrice(double costPerHour) throws CarNotFoundException;

	List<Car> findByFuelTypeAndModelAndTransmission(String fuelType, String model, String transmission)
			throws CarNotFoundException;

	List<Car> findByModelAndNoOfSeats(String model, int noOfSeats) throws CarNotFoundException;

}
