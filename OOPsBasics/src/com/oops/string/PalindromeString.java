package com.oops.string;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String st = sc.next();
		sc.close();
		st = st.toLowerCase();
		String rs = "";
		for (int i = (st.length() - 1); i >= 0; i--) {
			rs = rs + st.charAt(i);
		}
		if (st.equals(rs))
			System.out.println(st + " is a palindrome string");
		else
			System.out.println(st + " is not a palindrome string");
	}
}
