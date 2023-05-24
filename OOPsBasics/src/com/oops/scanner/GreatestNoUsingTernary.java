package com.oops.scanner;

public class GreatestNoUsingTernary {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int c = 2;

		String res = (a > b && a > c) ? a + " is biggest" : (b > c) ? b + " is biggest" : c + " is biggest";
		System.out.println(res);
	}
}
