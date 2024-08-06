package com.aurionpro.behavourial.observer.exceptions;

public class InsufficientFundsException extends RuntimeException{

	public String getMessage() {
		return "insufficient account balance";
	}

}
