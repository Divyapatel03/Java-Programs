package com.oops.scanner;

import java.util.Scanner;

public class EvenNumber {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter size of array: ");
//		int n = sc.nextInt();
//		int[] ar = new int[n];
//		System.out.println("Enter " + n + " Integer values");
//		for (int i = 0; i < ar.length; i++) {
//			ar[i] = sc.nextInt();
//		}
		for (int i = 0; i <= 20; i++) {
			if (i % 2 == 0)
				System.out.println(i);
		}

	}
}
