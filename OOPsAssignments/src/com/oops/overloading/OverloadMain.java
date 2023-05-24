package com.oops.overloading;

public class OverloadMain {
	public static void main(String[] args) {
		Employee employee = new Employee("Urmi", "Manager");
		employee.getDetails();
		employee.calcBonus(890, 1000);
		System.out.println("---------------------------------------");

		Employee employee1 = new Employee("Divya", "Programmer");
		employee1.getDetails();
		employee1.calcBonus(908);
		System.out.println("---------------------------------------");

		Employee employee2 = new Employee("Sonu", "Director");
		employee2.getDetails();
		employee2.calcBonus(680,980, 980);
	}
}
