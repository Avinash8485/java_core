package com;

public class BankImpl implements Bank{
	
	int balance = 5000;
	
	@Override
	public void depsoit(int amount) {
		System.out.println("Depositing amount"+amount);
		balance = balance+amount;
		System.out.println("Deposited SuccesFully");

	}
	
	@Override
	public void withdraw(int amount) {
		System.out.println("Withdrawing amount"+amount);
		balance = balance-amount;
		System.out.println("Withdraw SuccesFully");

	}
	
	@Override
	public void checkBalance() {
		System.out.println("Balance : "+balance);
	}
}


