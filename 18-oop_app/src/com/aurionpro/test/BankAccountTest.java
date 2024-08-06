package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.BankAccountModel;

public class BankAccountTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        
        System.out.println("Enter account number for first customer:");
        int accountNumber1 = sc.nextInt();
        System.out.println("Enter Name for first customer:");
        String name = sc.next();
        System.out.println("Enter Balance for first customer:");
        double balance = sc.nextDouble();
        BankAccountModel bam = new BankAccountModel(accountNumber1,name,balance);
        System.out.println("Cus ID: " + bam.getAccountNumber());
        System.out.println("Customer Name: " + bam.getCustomerName());
        System.out.println("Customer Balance: " + bam.getCustomerBalance());


        System.out.println("For customer 2");
        System.out.println("Enter account number for second customer:");
        int accountNumber2 = sc.nextInt();
        System.out.println("Enter Name for second customer:");
        String name2 = sc.next();
        System.out.println("Enter Balance for second customer:");
        double balance2 = sc.nextDouble();
        BankAccountModel bam2 = new BankAccountModel(accountNumber2,name2,balance2);
        System.out.println("Customer ID: " + bam2.getAccountNumber());
        System.out.println("Customer Name: " + bam2.getCustomerName());
        System.out.println("Customer Balance: " + bam2.getCustomerBalance());

        int choice;
        int accountNumber;
        double depositAmount, withdrawAmount;
        while (true) {
            System.out.println("Enter a choice: \n1. deposit \n2.withdraw \n3.exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Account number:");
                    accountNumber = sc.nextInt();

                    if (bam.getAccountNumber() == accountNumber) {
                        System.out.println("Enter an amount to deposit:");
                        depositAmount = sc.nextDouble();
                        if (depositAmount <= 0) {
                            System.out.println("You can't deposit that amount");
                        } else {
                            bam.setCustomerBalance(bam.getCustomerBalance() + depositAmount);
                            System.out.println("New Balance is " + bam.getCustomerBalance());
                        }
                    } else if (bam2.getAccountNumber() == accountNumber) {
                        System.out.println("Enter an amount to deposit:");
                        depositAmount = sc.nextDouble();
                        if (depositAmount <= 0) {
                            System.out.println("You can't deposit that amount");
                        } else {
                            bam2.setCustomerBalance(bam2.getCustomerBalance() + depositAmount);
                            System.out.println("New Balance is " + bam2.getCustomerBalance());
                        }
                    } else {
                        System.out.println("Account Not found");
                    }
                    break;
                case 2:
                    System.out.println("Enter Account number:");
                    accountNumber = sc.nextInt();

                    if (bam.getAccountNumber() == accountNumber) {
                        System.out.println("Enter an amount to withdraw:");
                        withdrawAmount = sc.nextDouble();
                        if (withdrawAmount <= 0) {
                            System.out.println("You can't withdraw that amount");
                        } else if (bam.getCustomerBalance() < withdrawAmount) {
                            System.out.println("Insufficient balance");
                        } else {
                            bam.setCustomerBalance(bam.getCustomerBalance() - withdrawAmount);
                            System.out.println("New Balance is " + bam.getCustomerBalance());
                        }
                    } else if (bam2.getAccountNumber() == accountNumber) {
                        System.out.println("Enter an amount to withdraw:");
                        withdrawAmount = sc.nextDouble();
                        if (withdrawAmount <= 0) {
                            System.out.println("You can't withdraw that amount");
                        } else if (bam2.getCustomerBalance() < withdrawAmount) {
                            System.out.println("Insufficient balance");
                        } else {
                            bam2.setCustomerBalance(bam2.getCustomerBalance() - withdrawAmount);
                            System.out.println("New Balance is " + bam2.getCustomerBalance());
                        }
                    } else {
                        System.out.println("Account Not found");
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Wrong Choice");
                    break;
            }
        }
    }
}
