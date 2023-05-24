package com.oops.basics;

public class SumAndAveragOfDigit {

	public static void main(String[] args) {
		int[] ar = { 123, 223, 233 };
		for (int i = 0; i < ar.length; i++) {
			int sum = countSum(ar[i]);
			System.out.println(sum);

			int avg = countAvg(ar[i]);
			System.out.println(avg);

			System.out.println("-------------------------------");
		}
	}

	private static int countSum(int i) {
		int dc = countDigit(i);
		int sum = 0;
		do {
			int r = i % 10;
			sum = sum + r;
			i = i / 10;
		} while (i != 0);
		return sum;
	}

	private static int countAvg(int j) {
		int dc = countDigit(j);
		int sum = 0;
		do {
			int r = j % 10;
			sum = sum + r;
			j = j / 10;
		} while (j != 0);
		int avg = sum / dc;
		return avg;
	}

	private static int countDigit(int n) {
		int count = 0;
		do {
			n = n / 10;
			count++;
		} while (n != 0);
		return count;
	}

}
