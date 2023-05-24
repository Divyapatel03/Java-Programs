package com.oops.inheritance;

public class Current extends Account {

	public Current(double balance) {
		super(balance);
	}

	@Override
	void withdraw(double amount) {
		super.withdraw(amount);
		System.out.println("Withdraw money " + amount);
	}

	@Override
	void deposit(double amount) {
		super.deposit(amount);
		System.out.println("Deposited  " + amount);
	}

}
