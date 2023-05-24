package com.oops.string;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumOccurrenceOfLetter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String st = sc.next();
		sc.close();

		char ch[] = st.toCharArray();
		Arrays.sort(ch);

		String s = new String(ch);
		int n = s.length();
		int max_count = 0;
		int count = 1;
		char ans = '-';

		for (int i = 1; i <= n; i++) {
			if (i == n || s.charAt(i) != s.charAt(i - 1)) {
				if (max_count < count) {
					max_count = count;
					ans = s.charAt(i - 1);
				}
				count = 1;
			} else
				count++;
		}
		System.out.println("Maximum occurence of character: "+ans);

	}
}