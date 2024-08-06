package com.aurionpro.model;

import com.aurionpro.exception.OverdraftLimitException;

public class CurrentAccount extends BankAccounAPP {

    public final double overDraftLimit = 100000;
    public double usedOverdraftAmount = 0;

    public double getOverDraftLimit() {
        return overDraftLimit;
    }

    public CurrentAccount(String name, double balance, int accountNumber) {
        super(balance, name, accountNumber);
    }

    public void credit(double depositAmount) {
        if (depositAmount <= 0) {
            System.out.println("You can't deposit that amount");
            return;
        }
        this.setBalance(getBalance() + depositAmount);


        if (this.getBalance() >= 0) {
            this.usedOverdraftAmount = 0;
        } else {
            this.usedOverdraftAmount = Math.abs(this.getBalance());
        }

        System.out.println("New balance is " + this.getBalance());
    }

    public void withdraw(double withdrawAmount) {
        if (withdrawAmount < 0) {
            System.out.println("You can't withdraw that amount");
            return;
        }

        double newBalance = this.getBalance() - withdrawAmount;
        double potentialOverdraft = Math.abs(newBalance) > 0 ? Math.abs(newBalance) : 0;

        if (potentialOverdraft > overDraftLimit) {
            throw new OverdraftLimitException(potentialOverdraft);
        }

        this.setBalance(newBalance);
        this.usedOverdraftAmount = potentialOverdraft;

        System.out.println("Balance after withdrawal: " + this.getBalance());
        System.out.println("Used overdraft amount: " + this.usedOverdraftAmount);
        System.out.println("Overdraft Limit: " + this.overDraftLimit);
    }

    @Override
    public String toString() {
        return "CurrentAccount [overDraftLimit=" + overDraftLimit + ", Balance=" + getBalance() + ", Name=" + getName()
                + ", Account Number=" + getAccountNumber() + "]";
    }
}
