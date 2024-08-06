package com.aurionpro.model;

public class BankAccounAPP {
	private double balance;
	private String name;
	private int accountNumber;
	
	
	public BankAccounAPP(double balance, String name, int accountNumber) {
		super();
		this.balance = balance;
		this.name = name;
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
}
