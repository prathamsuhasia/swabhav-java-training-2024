package com.aurionpro.behavourial.observer.exceptions;

public class InvalidDepsoitAmountException extends RuntimeException {
	
	public String getMessage() {
	return "Amount can't be negative";	
	}
	

}
