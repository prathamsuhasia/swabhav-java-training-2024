package com.aurionpro.model;

public class Account {
	private double balance;
	private String name;

public Account(double balance, String name) {
		super();
		this.balance = balance;
		this.name = name;
	}
public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [balance=" + balance + ", name=" + name + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


}
