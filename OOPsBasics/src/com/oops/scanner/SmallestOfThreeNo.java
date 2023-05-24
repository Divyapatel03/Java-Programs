package com.oops.scanner;

import java.util.Scanner;

public class SmallestOfThreeNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Integer value: ");
		int a = sc.nextInt();
		System.out.println("Enter 2st Integer value: ");
		int b = sc.nextInt();
		System.out.println("Enter 3st Integer value: ");
		int c = sc.nextInt();
		sc.close();
		if (a < b && a < c)
			System.out.println(a + " is smallest");
		else if (b < c)
			System.out.println(b + " is smallest");
		else
			System.out.println(c + " is smallest");

	}
}
