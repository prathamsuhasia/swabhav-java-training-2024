package com.aurionpro.exceptions;

public class NegativeAmountException extends RuntimeException{
	private double enteredValue;

	public NegativeAmountException(double enteredValue) {
		super();
		this.enteredValue = enteredValue;
	}
	
	public String getMessage() {
		return "Invalid amount: You entered a negative amount to Withdraw/Deposit your entered value" + enteredValue; 
	}
	

}
