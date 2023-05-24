package com.oops.abstractdemo;

public class ISaving extends Bank {

	public ISaving(double balance) {
		super(balance);
	}

	@Override
	void withdraw(double amount) {
		System.out.println("Withdraw money " + amount);
	}

	@Override
	void deposit(double amount) {
		System.out.println("Deposited  " + amount);
	}
}
