package com.oops.quest1;

public class Main {
	public static void main(String[] args) {

		Calculator calculator = (x, y) -> {
			return x + y;
		};
		System.out.println("Addition: " + calculator.calculate(2, 3));

		calculator = (x, y) -> {
			return x - y;
		};
		System.out.println("Substraction: " + calculator.calculate(20, 3));

		calculator = (x, y) -> {
			return x * y;
		};
		System.out.println("Multiplication: " + calculator.calculate(20, 30));

		calculator = (x, y) -> {
			return x / y;
		};
		System.out.println("Division: " + calculator.calculate(20, 3));
	}
}
