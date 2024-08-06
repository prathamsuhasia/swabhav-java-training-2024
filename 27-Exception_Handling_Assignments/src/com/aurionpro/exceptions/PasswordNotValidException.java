package com.aurionpro.exceptions;

public class PasswordNotValidException extends RuntimeException {
	private String password;

	public PasswordNotValidException(String password) {
		super();
		this.password = password;
	}
	
	public String getMessage () {
		
		return "Password not valid: your password is " + password;
	}


}
