package com.aurionpro.creational.abstractfactory.model;

public class SavingsAccount extends Account implements IAccount {

    private static final double MINIMUM_BALANCE = 1000.0;

    public SavingsAccount(int accountNumber, String name, double balance) {
        super(accountNumber, name, balance);
    }

    @Override
    public double credit(double creditAmount) {
        if (creditAmount <= 0) {
            System.out.println("Cannot deposit that amount");
            return this.getBalance();
        }

        this.setBalance(this.getBalance() + creditAmount);
        return this.getBalance();
    }

    @Override
    public double debit(double debitAmount) {
        if (debitAmount <= 0) {
            System.out.println("Cannot withdraw that amount");
            return this.getBalance();
        }

        if (this.getBalance() - debitAmount < MINIMUM_BALANCE) {
            System.out.println("Cannot withdraw. Balance would drop below the minimum balance of " + MINIMUM_BALANCE);
            return this.getBalance();
        }

        this.setBalance(this.getBalance() - debitAmount);
        return this.getBalance();
    }
}
