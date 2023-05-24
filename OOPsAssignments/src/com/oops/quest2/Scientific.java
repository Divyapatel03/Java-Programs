package com.oops.quest2;

public class Scientific implements BasicCalculator, ScientificCalculator {

	@Override
	public void squareRoot(int x) {
		System.out.println("SquareRoot: " + Math.sqrt(100));
	}

	@Override
	public void cube(int y) {
		int x = y * y * y;
		System.out.println("Cube: " + x);
	}

	@Override
	public void add(int x, int y) {
		int a = x + y;
		System.out.println("Addition: " + a);
	}

	@Override
	public void product(int x, int y) {
		int a = x * y;
		System.out.println("Product: " + a);
	}

	@Override
	public void difference(int x, int y) {
		int a = x - y;
		System.out.println("Difference: " + a);
	}

	@Override
	public void divide(int x, int y) {
		int a = x / y;
		System.out.println("Divide: " + a);
	}

}
