package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.exceptions.InsufficientBalanceException;
import com.aurionpro.exceptions.NegativeAmountException;
import com.aurionpro.model.Account;

public class AccountTest {
	public static void main(String[] args) {
		
		Account account = new Account(123, "Pratham", 50000);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter amount to withdraw" );
		double  withdrawamount = scanner.nextDouble();
		
		try {
		
			account.withdraw(withdrawamount);
	
		}
		catch(InsufficientBalanceException exception) {
			System.out.println(exception.getMessage());
		}
		catch(NegativeAmountException exception) {
			System.out.println(exception.getMessage());
		}
		
	}
}
