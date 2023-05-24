package com.oops.string;

import java.util.Scanner;

public class LongestWordInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String st = sc.nextLine();
		sc.close();
		int result = getLongest(st);
		System.out.println("Longest word in sentence "+result);
	}

	private static int getLongest(String st) {
		int count = 0;
		int longestWord = 0;

		for (int i = 0; i < st.length(); i++) {
			if (st.charAt(i) != ' ')
				count++;
			else {
				longestWord = Math.max(longestWord, count);
				count = 0;
			}
		}
		return Math.max(longestWord, count);
	}
}
