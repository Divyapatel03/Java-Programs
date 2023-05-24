package com.oops.basics;

public class Prime {
	public static void main(String[] args) {
		int n=3;
		boolean rs=isPrime(n);
		if (rs)
			System.out.println(n + " is prime number");
		else
			System.out.println(n + " not a prime number");
	}

	private static boolean isPrime(int n) {
		for (int i = 0; i <= n / 2; i++) {
			if (n % 2 == 0)
				return false;
		}
		return true;
	}
}
