package com.oops.scanner;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		String username[] = { "Divya", "Urmi", "Sonu" };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username to Login: ");
		String st = sc.next();
		sc.close();
		boolean rs = check(st, username);
		if (rs)
			System.out.println("You are logged in successfully");
		else
			System.out.println("Invalid Username");

	}

	private static boolean check(String st, String[] username) {
		for (String name : username) {
			if (st.equals(name))
				return true;
		}
		return false;
	}
}
