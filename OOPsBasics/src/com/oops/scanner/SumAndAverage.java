package com.oops.scanner;

import java.util.Scanner;

public class SumAndAverage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n = sc.nextInt();
		int[] ar = new int[n];
		System.out.println("Enter " + n + " Integer values");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();
		for (int i = 0; i < ar.length; i++) {
			int res = summation(ar[i]);
			int avg = res / ar.length;
			System.out.println("The sum is: " + res);
			System.out.println("The Average is: " + avg);
			System.out.println("-------------------------");
		}

	}

	private static int summation(int n) {
		int sum = 0;
		do {
			int r = n % 10;
			sum = sum + r;
			n = n / 10;
		} while (n != 0);
		return sum;
	}
}
