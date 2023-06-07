package com.carapp.controller;

import java.util.List;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.carapp.model.Car;
import com.carapp.service.ICarService;

@RestController
@RequestMapping("/car-api")
public class CarController {
	private ICarService carService;

	public CarController(ICarService carService) {
		super();
		this.carService = carService;
	}

//	http://localhost:8080/car-api/cars
//	 {
//	        "model": "BMW",
//	        "brand": "MINI",
//	        "transmission": "manual",
//	        "city": "bangalore",
//	        "fuelType": "petrol",
//	        "noOfSeats": 8,
//	        "costPerHour": 1500.0,
//	        "tripsCompleted": 2,
//	        "carAge": 1,
//	        "carId": 2
//	    }
	@PostMapping("/cars")
	ResponseEntity<Void> addCar(@RequestBody Car car) {
		carService.addCar(car);
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("info", "adding car");
		return ResponseEntity.status(HttpStatus.CREATED).headers(httpHeaders).build();

	}
//	http://localhost:8080/car-api/cars/carId/2/carAge/2
//	 {
//	        "model": "BMW",
//	        "brand": "MINI",
//	        "transmission": "manual",
//	        "city": "bangalore",
//	        "fuelType": "petrol",
//	        "noOfSeats": 8,
//	        "costPerHour": 1500.0,
//	        "tripsCompleted": 2,
//	        "carAge": 1,
//	        "carId": 2
//	    }
//	using patchmapping
	@PatchMapping("cars/carId/{carId}/carAge/{carAge}")
	ResponseEntity<Void> updateCar(@PathVariable("carId") int carId, @PathVariable("carAge") int carAge) {
		carService.updateCar(carId, carAge);
		return ResponseEntity.accepted().build();
	}

//	http://localhost:8080/car-api/cars/carId/2
	@DeleteMapping("/cars/carId/{carId}")
	ResponseEntity<Void> deletecar(@PathVariable("carId") int carId) {
		carService.deleteCar(carId);
		return ResponseEntity.accepted().build();
	}

	@GetMapping("/cars")
	ResponseEntity<List<Car>> getAll() {
		List<Car> cars = carService.getAll();
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("info", "Returning all Cars");
		httpHeaders.add("desc", "Car from database");
		// nonstatic
		ResponseEntity<List<Car>> responseEntity = new ResponseEntity<List<Car>>(cars, httpHeaders, HttpStatus.OK);
		return responseEntity;
	}

//	http://localhost:8080/car-api/cars
	@GetMapping("/cars/id/{CarId}")
	ResponseEntity<Car> getById(@PathVariable("CarId") int CarId) {
		Car cars = carService.getById(CarId);
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("info", "Returning one Car by id");
		// static
		return ResponseEntity.status(HttpStatus.OK).headers(httpHeaders).body(cars);
	}

//	http://localhost:8080/car-api/cars/carAge/2
	@GetMapping("/cars/carAge/{carAge}")
	ResponseEntity<Car> getByCarAge(@PathVariable("carAge") int carAge) {
		Car cars = carService.getByCarAge(carAge);
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("info", "Returning Car by Age");
		// static
		return ResponseEntity.status(HttpStatus.OK).headers(httpHeaders).body(cars);
	}

//	http://localhost:8080/car-api/cars/costPerHour/1600
	@GetMapping("/cars/costPerHour/{costPerHour}")
	ResponseEntity<List<Car>> getByPrice(@PathVariable("costPerHour") double costPerHour) {
		List<Car> cars = carService.getByPrice(costPerHour);
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("info", "Returning  book by costPerHour " + costPerHour);
		return ResponseEntity.status(HttpStatus.OK).headers(httpHeaders).body(cars);
	}

//	http://localhost:8080/car-api/cars/model/scorpio/brand/mahindra/city/bangalore
	@GetMapping("/cars/model/{model}/brand/{brand}/city/{city}")
	ResponseEntity<List<Car>> findByModelAndBrandAndCity(@PathVariable("model") String model,
			@PathVariable("brand") String brand, @PathVariable("city") String city) {
		List<Car> cars = carService.getByModelAndBrandAndCity(model, brand, city);
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("info", "Returning  book by model,brand,city " + model + " " + brand + " " + city);
		return ResponseEntity.status(HttpStatus.OK).headers(httpHeaders).body(cars);
	}

//	http://localhost:8080/car-api/cars/fuelType/petrol/model/BMW/transmission/manual
	@GetMapping("/cars/fuelType/{fuelType}/model/{model}/transmission/{transmission}")
	ResponseEntity<List<Car>> findByFuelTypeAndModelAndTransmission(@PathVariable("fuelType") String fuelType,
			@PathVariable("model") String model, @PathVariable("transmission") String transmission) {
		List<Car> cars = carService.getByFuelTypeAndModelAndTransmission(fuelType, model, transmission);
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("info",
				"Returning  book by fuelType,model,transmission " + fuelType + " " + model + " " + transmission);
		return ResponseEntity.status(HttpStatus.OK).headers(httpHeaders).body(cars);
	}

//	http://localhost:8080/car-api/cars/model/BMW/noOfSeats/8
	@GetMapping("/cars/model/{model}/noOfSeats/{noOfSeats}")
	ResponseEntity<List<Car>> findByModelAndNoOfSeats(@PathVariable("model") String model,
			@PathVariable("noOfSeats") int noOfSeats) {
		List<Car> cars = carService.getByModelAndNoOfSeats(model, noOfSeats);
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("info", "Returning  book by model,noOfSeats " + model + " " + noOfSeats);
		return ResponseEntity.status(HttpStatus.OK).headers(httpHeaders).body(cars);
	}
}
