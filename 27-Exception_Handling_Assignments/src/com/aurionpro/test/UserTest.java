package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.exceptions.EmailNotValidException;
import com.aurionpro.exceptions.PasswordNotValidException;
import com.aurionpro.model.User;

public class UserTest {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Email");
		String email = scanner.next();
		System.out.println("Enter Passsword");
		String password  = scanner.next();
		
		try {
			User user = new User(email,password);
			System.out.println("User created succesfully!!");
			System.out.println(user);
		}
		catch(EmailNotValidException exception) {
			System.out.println(exception.getMessage());
		}
		catch(PasswordNotValidException exception) {
			System.out.println(exception.getMessage());
		}
		

		
		
	}
}
