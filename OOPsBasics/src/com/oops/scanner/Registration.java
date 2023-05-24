package com.oops.scanner;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {
		String username[] = { "Divya", "Urmi", "Sonu" };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name to register: ");
		String st = sc.next();
		sc.close();
		boolean rs = check(st, username);
		if (rs)
			System.out.println("Name is not unique");
		else
			System.out.println("You are registered");

	}

	private static boolean check(String st, String[] username) {
		for (String name:username) {
			if (st.equals(name))
				return true;
		}
		return false;
	}

}
