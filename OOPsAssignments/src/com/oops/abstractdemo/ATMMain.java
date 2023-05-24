package com.oops.abstractdemo;

import java.util.Scanner;

public class ATMMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose 1. for withdraw \n 2. for deposit");
		int n = sc.nextInt();
		System.out.println("Choose account type:");
		String type = sc.next();
		sc.close();
		switch (n) {
		case 1:
			if (type.equals("saving")) {
				System.out.println("Saving account");
				Bank bank = new ISaving(100000);
				bank.withdraw(500);
				System.out.print("Total balance ");
				System.out.println(bank.getBalance());
			} else {
				Bank bank = new ICurrent(9868);
				System.out.println("Current account");
				bank.withdraw(500);
				System.out.print("Total balance ");
				System.out.println(bank.getBalance());
			}
			break;

		case 2:
			if (type.equals("current")) {
				Bank bank = new ISaving(100000);
				bank.deposit(1000);
				System.out.print("Total balance ");
				System.out.println(bank.getBalance());
			} else {
				Bank bank = new ICurrent(9868);
				bank.deposit(9876);
				System.out.print("Total balance ");
				System.out.println(bank.getBalance());
			}
			break;

		default:
			System.out.println("Invalid Choice");

		}
	}
}
