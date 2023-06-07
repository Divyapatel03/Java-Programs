package com.carapp.repository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.carapp.model.Car;

@Repository
public class CarRepositoryImpl implements ICarRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void addCar(Car car) {
		String sql = "insert into car(carId,model,brand,transmission,city,fuelType,noOfSeats,costPerHour,carAge,tripCompleted)values(?,?,?,?,?,?,?,?,?,?)";
		Object[] carArray = { car.getCarId(), car.getModel(), car.getBrand(), car.getTransmission(), car.getCity(),
				car.getFuelType(), car.getNoOfSeats(), car.getCostPerHour(), car.getCarAge(), car.getTripsCompleted() };
		jdbcTemplate.update(sql, carArray);
	}

	@Override
	public void updateCar(int CarId, int carAge) {
		String sql = "update car set carAge=? where CarId=?";
		jdbcTemplate.update(sql, carAge, CarId);
	}

	@Override
	public void deleteCar(int CarId) {
		String sql = "delete from car where CarId=?";
		jdbcTemplate.update(sql, CarId);
	}

	@Override
	public List<Car> findAll() {
		String sql = "select * from car";
		return jdbcTemplate.query(sql, new CarMapper());
	}

	@Override
	public Car findById(int CarId) {
		String sql = "select * from car where carId=?";
		return jdbcTemplate.queryForObject(sql, new CarMapper(), CarId);
	}

	@Override
	public Car findByCarAge(int carAge) {
		String sql = "select * from car where carAge=?";
		return jdbcTemplate.queryForObject(sql, new CarMapper(), carAge);
	}

	@Override
	public List<Car> findByModelAndBrandAndCity(String model, String brand, String city) {
		String sql = "select * from car where model=? and brand=? and city=?";
		return jdbcTemplate.query(sql, new CarMapper(), model, brand, city);
	}

	@Override
	public List<Car> findByPrice(double costPerHour) {
		String sql = "select * from car where costPerHour=?";
		return jdbcTemplate.query(sql, new CarMapper(), costPerHour);
	}

	@Override
	public List<Car> findByFuelTypeAndModelAndTransmission(String fuelType, String model, String transmission) {
		String sql = "select * from car where fuelType=? and model=? and transmission=?";
		return jdbcTemplate.query(sql, new CarMapper(), fuelType, model, transmission);
	}

	@Override
	public List<Car> findByModelAndNoOfSeats(String model, int noOfSeats) {
		String sql = "select * from car where model=? and noOfSeats=?";
		return jdbcTemplate.query(sql, new CarMapper(), model, noOfSeats);
	}

}
