package com.aurionpro.exceptions;

public class InsufficientBalanceException  extends RuntimeException{
	private double balance;
	public InsufficientBalanceException(double balance) {

		this.balance = balance;
	}

	public String getMessage () {
	
		
	 
		return "Insufficient balance: Your balance is " + balance;
	}
}
