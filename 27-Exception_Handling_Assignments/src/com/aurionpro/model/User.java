package com.aurionpro.model;

import com.aurionpro.exceptions.EmailNotValidException;
import com.aurionpro.exceptions.PasswordNotValidException;

import java.util.regex.*;

public class User {
	
	private String email ;
	private String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if (!validateEmail(email))
			throw new EmailNotValidException(email);
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		if(!validatePassword(password,8))
			throw new PasswordNotValidException(password);
		this.password = password;
	}
	public User(String email, String password) {
		super();
		if (!validateEmail(email))
			throw new EmailNotValidException(email);
		this.email = email;
		if(!validatePassword(password,8))
			throw new PasswordNotValidException(password);
		this.password = password;
	}

	public boolean validatePassword(String password, int minLength)
	{

		if(password==null || password=="" || password.length()<minLength )
			return false;
		
	    String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{9,}$";
	    Pattern p = Pattern.compile(regex);
	    Matcher m = p.matcher(password);
		return m.matches();
	}
	public boolean validateEmail(String email)
	{
		
		if(!email.contains("@") || !email.contains(".") || email==null || email==""  || email.length()<5)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + "]";
	}

}
