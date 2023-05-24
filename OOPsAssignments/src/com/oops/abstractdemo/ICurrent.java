package com.oops.abstractdemo;

public class ICurrent extends Bank {

	public ICurrent(double balance) {
		super(balance);
	}

	@Override
	void withdraw(double amount) {
		System.out.println("Withdraw money " + amount);
	}

	@Override
	void deposit(double amount) {
		System.out.println("Deposited money " + amount);
	}

}
