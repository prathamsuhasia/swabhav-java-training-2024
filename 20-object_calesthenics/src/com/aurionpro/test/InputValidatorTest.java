package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.InputValidatorModel;
public class InputValidatorTest {
	 
	public static void main(String[] args) {
 
		InputValidatorModel validator=new InputValidatorModel();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Username");
        String username=scanner.next();
        checkUsername(validator, username);
        System.out.println("Enter Passowrd");
        String password=scanner.next();
        checkPassword(validator, password);
        System.out.println("Enter Email");
        String email=scanner.next();
        checkEmail(validator, email);
 
	}
	private static void checkUsername(InputValidatorModel validator, String username)
	{
		if(!validator.validateUsername(username))
        {
        	System.out.println("Username is invalid");
        	return;
        }
        System.out.println("Username is valid");
	}
	private static void checkPassword(InputValidatorModel validator, String password)
	{
		if(!validator.validatePassword(password))
        {
        	System.out.println("Passowrd is invalid");
        	return;
        }
        System.out.println("Password is valid");
	}
	private static void checkEmail(InputValidatorModel validator, String email)
	{
		if(!validator.validatePassword(email))
        {
        	System.out.println("Email is invalid");
        	return;
        }
        System.out.println("Email is valid");
	}
 
}
