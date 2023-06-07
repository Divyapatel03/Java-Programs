package com.carapp.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.carapp.model.Car;

public class CarMapper implements RowMapper<Car> {

	@Override
	public Car mapRow(ResultSet rs, int rowNum) throws SQLException {
		Car car = new Car();
		car.setBrand(rs.getString("brand"));
		car.setCarAge(rs.getInt("carAge"));
		car.setCarId(rs.getInt("carId"));
		car.setCity(rs.getString("city"));
		car.setCostPerHour(rs.getDouble("costPerHour"));
		car.setFuelType(rs.getString("fuelType"));
		car.setModel(rs.getString("model"));
		car.setNoOfSeats(rs.getInt("noOfSeats"));
		car.setTransmission(rs.getString("transmission"));
		car.setTripsCompleted(rs.getInt("tripCompleted"));
		return car;
	}
}
