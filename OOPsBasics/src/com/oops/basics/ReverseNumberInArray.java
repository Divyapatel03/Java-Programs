package com.oops.basics;

public class ReverseNumberInArray {
	public static void main(String[] args) {
		int[] ar = { 189, 221, 368 };
		for (int i = 0; i < ar.length; i++) {
			int rs = reverse(ar[i]);
			System.out.println(rs+" ");
		}

	}

	private static int reverse(int n) {
		int rev = 0;
		while (n != 0) {
			int r = n % 10;
			rev = rev * 10 + r;
			n = n / 10;
		}
		return rev;
	}
}
