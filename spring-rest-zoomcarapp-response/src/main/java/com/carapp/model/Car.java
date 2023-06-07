package com.carapp.model;

public class Car {
	private Integer CarId;
	private String model;
	private String brand;
	private String transmission;
	private String city;
	private String fuelType;
	private Integer noOfSeats;
	private double costPerHour;
	private Integer tripsCompleted;
	private Integer carAge;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(Integer carId, String model, String brand, String transmission, String city, String fuelType,
			Integer noOfSeats, double costPerHour, Integer tripsCompleted, Integer carAge) {
		super();
		CarId = carId;
		this.model = model;
		this.brand = brand;
		this.transmission = transmission;
		this.city = city;
		this.fuelType = fuelType;
		this.noOfSeats = noOfSeats;
		this.costPerHour = costPerHour;
		this.tripsCompleted = tripsCompleted;
		this.carAge = carAge;
	}

	public Integer getCarId() {
		return CarId;
	}

	public void setCarId(Integer carId) {
		CarId = carId;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public Integer getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(Integer noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public double getCostPerHour() {
		return costPerHour;
	}

	public void setCostPerHour(double costPerHour) {
		this.costPerHour = costPerHour;
	}

	public Integer getTripsCompleted() {
		return tripsCompleted;
	}

	public void setTripsCompleted(Integer tripsCompleted) {
		this.tripsCompleted = tripsCompleted;
	}

	public Integer getCarAge() {
		return carAge;
	}

	public void setCarAge(Integer carAge) {
		this.carAge = carAge;
	}

	@Override
	public String toString() {
		return "Car [CarId=" + CarId + ", model=" + model + ", brand=" + brand + ", transmission=" + transmission
				+ ", city=" + city + ", fuelType=" + fuelType + ", noOfSeats=" + noOfSeats + ", costPerHour="
				+ costPerHour + ", tripsCompleted=" + tripsCompleted + ", carAge=" + carAge + "]";
	}

}
