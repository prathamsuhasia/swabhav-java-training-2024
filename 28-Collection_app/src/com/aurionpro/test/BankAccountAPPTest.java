package com.aurionpro.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.model.CurrentAccount;
import com.aurionpro.model.SavingsAccount;
import com.aurionpro.exception.OverdraftLimitException;
import com.aurionpro.exception.MinimumBalanceException;

public class BankAccountAPPTest {

    private static Scanner scanner = new Scanner(System.in);
    private static List<Object> accounts = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Enter number of accounts to create");
        int numberOfAccounts = scanner.nextInt();

        for (int i = 0; i < numberOfAccounts; i++) {
            createAccount();
        }

        while (true) {
            performOperations();
            printMaxBalanceAccount();

        }
    }

    private static void createAccount() {
        System.out.println("Enter type of account you want to create \n1. Savings \n2. Current");
        int typeOfAccount = scanner.nextInt();

        System.out.println("Enter customer name");
        String name = scanner.next();

        System.out.println("Enter account balance");
        double balance = scanner.nextDouble();

        System.out.println("Enter account number");
        int accountNumber = scanner.nextInt();

        if (typeOfAccount == 1) {
            accounts.add(new SavingsAccount(balance, name, accountNumber));
            System.out.println("Savings account created successfully");
        } else if (typeOfAccount == 2) {
            accounts.add(new CurrentAccount(name, balance, accountNumber));
            System.out.println("Current account created successfully");
        } else {
            System.out.println("Invalid account type");
        }
    }

    private static void performOperations() {
        System.out.println("\nEnter account number for operations");
        int accountNumber = scanner.nextInt();

        Object account = getAccountByNumber(accountNumber);

        if (account == null) {
            System.out.println("Account not found!");
            return;
        }

        System.out.println("\nEnter a choice \n1. Deposit \n2. Withdraw \n3. Exit");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter amount to deposit");
                double depositAmount = scanner.nextDouble();
                if (account instanceof SavingsAccount) {
                    ((SavingsAccount) account).credit(depositAmount);
                } else if (account instanceof CurrentAccount) {
                    ((CurrentAccount) account).credit(depositAmount);
                }
                break;

            case 2:
                System.out.println("Enter amount to withdraw");
                double withdrawAmount = scanner.nextDouble();
                try {
                    if (account instanceof SavingsAccount) {
                        ((SavingsAccount) account).withdraw(withdrawAmount);
                    } else if (account instanceof CurrentAccount) {
                        ((CurrentAccount) account).withdraw(withdrawAmount);
                    }
                } catch (OverdraftLimitException | MinimumBalanceException exception) {
                    System.out.println(exception.getMessage());
                }
                break;

            case 3:
                System.out.println("Exiting...");
                System.exit(0);
                break;

            default:
                System.out.println("Invalid choice. Exiting...");
                System.exit(0);
                break;
        }
    }

    private static Object getAccountByNumber(int accountNumber) {
        for (Object account : accounts) {
            if (account instanceof SavingsAccount && ((SavingsAccount) account).getAccountNumber() == accountNumber) {
                return account;
            } else if (account instanceof CurrentAccount && ((CurrentAccount) account).getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }

    private static void printMaxBalanceAccount() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts available.");
            return;
        }

        Object maxBalanceAccount = null;
        double maxBalance = Double.NEGATIVE_INFINITY;

        for (Object account : accounts) {
            double balance = 0.0;
            if (account instanceof SavingsAccount) {
                balance = ((SavingsAccount) account).getBalance();
            } else if (account instanceof CurrentAccount) {
                balance = ((CurrentAccount) account).getBalance();
            }

            if (balance > maxBalance) {
                maxBalance = balance;
                maxBalanceAccount = account;
            }
        }

        System.out.println("Account with max balance:");
        if (maxBalanceAccount != null) {
            System.out.println(maxBalanceAccount);
        }
    }




}
