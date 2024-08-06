package com.aurionpro.model;

public class CurrentAccount extends Account {
	private int overDraftLimit = 50000;
	private double usedOverdraftAmount = 0;

	public int getOverDraftLimit() {
		return overDraftLimit;
	}
	public CurrentAccount(String name, double balance, int accountNumber) {
		super(balance, name, accountNumber);

	}
	public void credit(double creditAmount) {
		if (creditAmount <= 0) {
			System.out.println("You cant deposit that amount");
			return;
		}
		this.setBalance(getBalance() + creditAmount);
	}
	public void withdraw(double withdrawAmount) {
		if (withdrawAmount < 0) {
			System.out.println("You can't withdraw that amount");
			return;
		}
		double newBalance = this.getBalance() - withdrawAmount;
		double potentialOverdraft = Math.abs(newBalance) > 0 ? Math.abs(newBalance) : 0;

		if (potentialOverdraft > overDraftLimit) {
			System.out.println("Withdrawal exceeds overdraft limit. Transaction declined.");
			return;
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
	public void setOverDraftLimit(int overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
	}
}
