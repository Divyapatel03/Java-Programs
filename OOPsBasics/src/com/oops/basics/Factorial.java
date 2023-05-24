package com.oops.basics;

public class Factorial {
	public static void main(String[] args) {
		int n = 5;
		int fact = 1;
		int i = 2;
		while (i <= n) {
			fact = fact * i;
			i++;
		}
		System.out.println(fact);
	}
}
