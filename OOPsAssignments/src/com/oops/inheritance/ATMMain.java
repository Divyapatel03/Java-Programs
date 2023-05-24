package com.oops.inheritance;

import java.util.Scanner;

public class ATMMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose 1 for saving account \n 2 for current account");
		int n = sc.nextInt();
		sc.close();
		switch (n) {
		case 1:
			System.out.println("Saving Account");
			Account account = new Saving(100000);
			account.getBalance();
			account.withdraw(5000);
			account.deposit(1000);
			System.out.println(account.getBalance());
			break;
		case 2:
			System.out.println("Current Account");
			Account account1 = new Current(10000);
			account1.getBalance();
			account1.withdraw(5000);
			account1.deposit(1000);
			account1.getBalance();
			System.out.println(account1.getBalance());
			break;
		default:
			System.out.println("Invalid choice");

		}
	}
}
