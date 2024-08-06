package com.aurionpro.test;

import com.aurionpro.model.CurrentAccount;
import com.aurionpro.model.SavingsAccount;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        SavingsAccount account1 = new SavingsAccount( 50000, "Pratham", 1234);
        CurrentAccount account2 = new CurrentAccount("Suhas", 2000, 5678);

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Credit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    int accountNumber = scanner.nextInt();
                    System.out.print("Enter amount to credit: ");
                    double creditAmount = scanner.nextDouble();
                    if (account1.getAccountNumber() == accountNumber) {
                        account1.credit(creditAmount);
                    } else if (account2.getAccountNumber() == accountNumber) {
                        account2.credit(creditAmount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 2:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.nextInt();
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (account1.getAccountNumber() == accountNumber) {
                        account1.withdraw(withdrawAmount);
                    } else if (account2.getAccountNumber() == accountNumber) {
                        account2.withdraw(withdrawAmount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.nextInt();
                    if (account1.getAccountNumber() == accountNumber) {
                        System.out.println(account1);
                    } else if (account2.getAccountNumber() == accountNumber) {
                        System.out.println(account2);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
