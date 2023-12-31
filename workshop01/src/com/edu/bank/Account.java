package com.edu.bank;

public class Account {
	public int accNumber;
	public String bankName;
	public double balance;
	
	public Account(int accNumber, String bankName, double balance) {
		super();
		this.accNumber = accNumber;
		this.bankName = bankName;
		this.balance = balance;
	}

	public int getAccNumber() {
		return accNumber;
	}

	public String getBankName() {
		return bankName;
	}

	public double getBalance() {
		return balance;
	}
	//
	public void deposit(double amount) {
		balance += amount;
	}
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	public String accountInfo() {
		return accNumber+"-"+bankName;
	}	
}
