package com.aurionpro.creational.abstractfactory.test;

import com.aurionpro.creational.abstractfactory.model.CurrentAccountFactory;
import com.aurionpro.creational.abstractfactory.model.IAccount;
import com.aurionpro.creational.abstractfactory.model.IAccountFactory;

import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {
        IAccountFactory accountFactory = new CurrentAccountFactory();
        IAccount account = accountFactory.createAccount(10000, "Pratham", 200000);
        
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Credit");
            System.out.println("2. Debit");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to credit: ");
                    double creditAmount = scanner.nextDouble();
                    
                    System.out.println("Current balance: " +  account.credit(creditAmount));
                    break;
                case 2:
                    System.out.print("Enter amount to debit: ");
                    double debitAmount = scanner.nextDouble();
                    
                    System.out.println("Current balance: " + account.debit(debitAmount));
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }
}
