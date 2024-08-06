package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.exceptions.OverdraftLimitException;
import com.aurionpro.model.CurrentAccount;
import com.aurionpro.model.SavingsAccount;

public class BankAccountAPPTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		CurrentAccount account1;
		System.out.println("Enter customer name");
		String name = scanner.next();
		System.out.println("Enter account balance ");
		double balance = scanner.nextDouble();
		System.out.println("Enter account number");
		int accountNumber = scanner.nextInt();

		account1 = new CurrentAccount(name, balance, accountNumber);
  //     SavingsAccount account2 = new SavingsAccount(balance, name, accountNumber);
		System.out.println("account created successfully");

		while (true) {
			System.out.println("\nEnter a choice \n1. Deposit \n2. withdraw \n3. exit ");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter amount to deposit");
				double depositAmount = scanner.nextDouble();
				account1.credit(depositAmount);
				break;
			case 2:
				System.out.println("Enter amount to withdraw");
				double withdrawAmount = scanner.nextDouble();
				try {
					account1.withdraw(withdrawAmount);
				} catch (OverdraftLimitException exception) {
					System.out.println(exception.getMessage());
				}
				break;
			case 3:
				System.out.println("Exiting....");
				return;
			default:
				System.out.println("Exiting....");
				return;
			}

		}

	}
}
