package com.carapp.service;

import java.util.List;

import com.carapp.exception.CarNotFoundException;
import com.carapp.model.Car;

public interface ICarService {
	void addCar(Car Car);

	void updateCar(int CarId, int carAge);

	void deleteCar(int CarId);

	List<Car> getAll();

	Car getById(int CarId) throws CarNotFoundException;

	Car getByCarAge(int carAge) throws CarNotFoundException;

	List<Car> getByModelAndBrandAndCity(String model, String brand, String city) throws CarNotFoundException;

	List<Car> getByPrice(double costPerHour) throws CarNotFoundException;

	List<Car> getByFuelTypeAndModelAndTransmission(String fuelType, String model, String transmission)
			throws CarNotFoundException;

	List<Car> getByModelAndNoOfSeats(String model, int noOfSeats) throws CarNotFoundException;

}
