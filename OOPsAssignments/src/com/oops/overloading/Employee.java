package com.oops.overloading;

public class Employee {
	String name;
	String designation;

	public Employee(String name, String designation) {
		super();
		this.name = name;
		this.designation = designation;
	}

	void getDetails() {
		System.out.println("Name of Employee :" + name);
		System.out.println("Designation of Employee :" + designation);
	}

	public double calcBonus(double basicAllowance, double carAllowance) {
		System.out.println("Class method");
		double result = basicAllowance + carAllowance;
		return result;
	}

	public double calcBonus(double basicAllowance, double carAllowance, double houseAllowance) {
		System.out.println("Class method");
		double result = basicAllowance + carAllowance + houseAllowance;
		return result;
	}

	public double calcBonus(double basicAllowance) {
		System.out.println("Class method");
		double result = basicAllowance;
		return result;
	}

}
