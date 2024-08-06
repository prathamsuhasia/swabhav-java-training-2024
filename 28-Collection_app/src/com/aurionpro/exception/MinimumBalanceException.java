package com.aurionpro.exception;

public class MinimumBalanceException extends RuntimeException {
	private double balance;
	private double limit;
	public MinimumBalanceException(double balance, double limit) {
		this.balance = balance;
		this.limit = limit;

	}

	public String getMessage() {
		return "Balance goes minimum balance limit limit is " + limit + " balance is " + balance;
	}
}
