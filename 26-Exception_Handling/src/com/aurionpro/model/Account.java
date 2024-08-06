package com.aurionpro.model;

import com.aurionpro.exceptions.InsufficientBalanceException;
import com.aurionpro.exceptions.NegativeAmountException;

public class Account {
	private int accountNumber;
	private String name;
	private double balance;
	
	
	
	public Account(int accountNumber, String name, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		
		this.balance = balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int an){
		accountNumber= an;
	}
	public String getCustomerName() {
		return name;
		
	}
	public void setCustomerName(String n) {
		name =n;
	}
	
	public double getCustomerBalance() {
		return balance;
	}
	public void setCustomerBalance(double b){
		balance= b;
	}
	
	public double deposit(double depositAmount) {
		if(depositAmount < 0)
			throw new NegativeAmountException(depositAmount); 
		return balance+depositAmount;
	}
	public double withdraw(double withdrawAmount) {
		if(withdrawAmount < 0)
			throw new NegativeAmountException(withdrawAmount); 
		
		if ((balance<withdrawAmount) ) 
			throw new InsufficientBalanceException(balance);
			
		return balance-withdrawAmount;
	}
}
