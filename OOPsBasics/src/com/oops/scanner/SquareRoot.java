package com.oops.scanner;

import java.util.Scanner;

public class SquareRoot {
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
			int res = squareRoot(ar[i]);
			System.out.println("The SquareRoot is: " + res);
			System.out.println("-------------------------");
		}

	}

	private static int squareRoot(int n) {
		int t;
		int sqrt = n / 2;
		do {
			t = sqrt;
			sqrt = (t + (n / t)) / 2;
		} while ((t - sqrt) != 0);
		return sqrt;
	}
}
