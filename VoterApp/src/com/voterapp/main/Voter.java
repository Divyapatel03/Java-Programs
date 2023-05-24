package com.voterapp.main;

import java.util.Scanner;

import com.voterapp.exception.InValidVoterException;
import com.voterapp.service.ElectionBooth;
import com.voterapp.service.ElectionBoothImpl;

public class Voter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		System.out.println("Enter Locaity:");
		String locality =sc.next();
		System.out.println("Enter voter id: ");
		int vid = sc.nextInt();
		sc.close();

		ElectionBooth electionBooth=new ElectionBoothImpl();
		boolean result;
		try {
			result = electionBooth.checkEligibility(age, locality, vid);
			if (result)
				System.out.println("successfully registered");
		} catch (InValidVoterException e) {
			System.out.println(e.getMessage());
		}
	}
}
