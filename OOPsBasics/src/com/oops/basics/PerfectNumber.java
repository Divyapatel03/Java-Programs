package com.oops.basics;

//sum of divisor is equal to that number
//6=1+2+3=6
public class PerfectNumber {
	public static void main(String[] args) {
		int n = 6;
		boolean rs = isPerfect(n);
		if (rs)
			System.out.println(n + " is perfect number");
		else
			System.out.println(n + " not a perfect number");
	}

	private static boolean isPerfect(int n) {
		int sum = 0;

		for (int i = 0; i <= n / 2; i++) {
			if (n % 2 == 0)
				sum = sum + i;
		}
		return sum == n;
	}
}
