package com.userapp.client;

import java.util.Scanner;

import com.userapp.exception.NameExistException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;
import com.userapp.service.IValidationService;
import com.userapp.service.ValidationServiceImpl;

public class Register {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username:");
		String usernames = sc.nextLine();

		IValidationService iValidationService = new ValidationServiceImpl();

		try {
			if (iValidationService.validateUserName(usernames)) {
				System.out.println("Enter the password");
				String password = sc.next();
				try {
					if (iValidationService.validatePassword(password))
						System.out.println("Registered successfully");
				} catch (TooShortException e) {
					System.err.println("Too short password");
				} catch (TooLongException e) {
					System.err.println("Too long password");
				}

			}
		} catch (NameExistException e) {
			System.err.println("Name already exist");
		}
	}

}
