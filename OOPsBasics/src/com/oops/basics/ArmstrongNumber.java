package com.oops.basics;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int n = 153;
		boolean rs = isArmstrong(n);
		if (rs)
			System.out.println(n + " is armstrong number");
		else
			System.out.println(n + " not a armstrong number");

	}

	private static boolean isArmstrong(int n) {
		int sum = 0;
		int temp = n;
		int dc = countDigit(n);
		do {
			int r = n % 10;
			sum = sum + pow(r, dc);
			n = n / 10;
		} while (n != 0);
		return sum == temp;
	}

	private static int pow(int r, int dc) {
		int pw = 1;
		while (dc > 0) {
			pw = pw * r;
			dc--;
		}
		return pw;
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
