package com.aurionpro.exceptions;

public class AgeNotValidException extends RuntimeException {
	
	public String getMessage () {
		
		return "Age not valid: age must not be less than 18";
	}

}
