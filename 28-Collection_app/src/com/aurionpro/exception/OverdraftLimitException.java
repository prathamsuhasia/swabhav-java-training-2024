package com.aurionpro.exception;

public class OverdraftLimitException extends RuntimeException {
	private double usedOverdraft;
	private double balance;
	public OverdraftLimitException( double balance ) {
		super();

		this.balance =balance;
	}

	public String getMessage() {
		return "Your overdraft limit exceeded:   Balance is " + balance ;
	}
}
