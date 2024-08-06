package com.aurionpro.test;

import java.util.Scanner;
import com.aurionpro.model.BankAccountModel;

public class BankAccountTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Customers in the bank");
        int numberOfcustomers = sc.nextInt();
        BankAccountModel customers[] = new BankAccountModel[numberOfcustomers];

        for (int i = 0; i < customers.length; i++) {
            System.out.println("Enter account number :");
            int accountNumber = sc.nextInt();
            System.out.println("Enter Name :");
            String name = sc.next();
            System.out.println("Enter Balance:");
            double balance = sc.nextDouble();
            System.out.println("Enter Account Type");
            String accountType = sc.next();
            customers[i] = new BankAccountModel(accountNumber, name, balance, accountType);
        }

        for (int i = 0; i < customers.length; i++) {
            System.out.println("Account Number : " + customers[i].getAccountNumber());
            System.out.println("Customer Name: " + customers[i].getCustomerName());
            System.out.println("Customer Balance: " + customers[i].getCustomerBalance());
            System.out.println("Account Type : " + customers[i].getAccountType());
        }

        int choice;
        int accountNumber;
        double depositAmount, withdrawAmount;
        while (true) {
            System.out.println("Enter a choice: \n1. deposit \n2.withdraw \n3. Show maximum Balance account \n4.exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Account number:");
                    accountNumber = sc.nextInt();
                    boolean found = false;
                    
                    for (int i = 0; i < customers.length; i++) {
                        if (customers[i].getAccountNumber() == accountNumber) {
                            System.out.println("Enter an amount to deposit:");
                            depositAmount = sc.nextDouble();
                            if (depositAmount <= 0) {
                                System.out.println("You can't deposit that amount");
                            } else {
                                customers[i].setCustomerBalance(customers[i].getCustomerBalance() + depositAmount);
                                System.out.println("New Balance is " + customers[i].getCustomerBalance());
                            }
                            found = true;
                            break;
                        }
                    }
                    
                    if (!found) {
                        System.out.println("Account Not found");
                    }
                    break;

                case 2:
                    System.out.println("Enter Account number:");
                    accountNumber = sc.nextInt();
                    found = false;
                    
                    for (int i = 0; i < customers.length; i++) {
                        if (customers[i].getAccountNumber() == accountNumber) {
                            System.out.println("Enter an amount to withdraw:");
                            withdrawAmount = sc.nextDouble();
                            if (withdrawAmount <= 0) {
                                System.out.println("You can't withdraw that amount");
                            } else if (customers[i].getCustomerBalance() < withdrawAmount) {
                                System.out.println("Insufficient balance");
                            } else {
                                customers[i].setCustomerBalance(customers[i].getCustomerBalance() - withdrawAmount);
                                System.out.println("New Balance is " + customers[i].getCustomerBalance());
                            }
                            found = true;
                            break;
                        }
                    }
                    
                    if (!found) {
                        System.out.println("Account Not found");
                    }
                    break;
                case 3:
                    getMaximumBalanceAccount(customers);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Wrong Choice");
                    break;
            }

        }
    }

	private static void getMaximumBalanceAccount(BankAccountModel[] customers) {
		BankAccountModel maxBalanceAccount = customers[0];
		
        for (int i = 1; i < customers.length; i++) {
            if (customers[i].getCustomerBalance() > maxBalanceAccount.getCustomerBalance()) {
                maxBalanceAccount = customers[i];
            }
        }

        System.out.println("Account with Maximum Balance:");
        System.out.println("Account Number: " + maxBalanceAccount.getAccountNumber());
        System.out.println("Customer Name: " + maxBalanceAccount.getCustomerName());
        System.out.println("Customer Balance: " + maxBalanceAccount.getCustomerBalance());
        System.out.println("Account Type: " + maxBalanceAccount.getAccountType());
	}
}
