package com.aurionpro.model;

public class SavingsAccount extends Account {

	private double minimumBalance = 1000;
	
	public SavingsAccount( double balance, String name, int accountNumber) {
		super(balance, name, accountNumber);
	
	}
	public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	
	public void credit(double creditAmount) {
		if(creditAmount<=0) {
			System.out.println("You cant deposit that amount");
			return;
		}
		this.setBalance(getBalance() + creditAmount);
	}
	
	public void withdraw(double withdrawAmount) {
		if  (withdrawAmount<0) {
			System.out.println("You cant withdraw that amount");
			return;
		}
		if ((this.getBalance()- withdrawAmount) < this.getMinimumBalance() ) {
			System.out.println("Amount cannot  be withdrawn. You need to maintain minimum balance");
			return;
		}
		this.setBalance(this.getBalance() - withdrawAmount);
		System.out.println("Balance after withdraw " + this.getBalance());
		
	}
	@Override
	public String toString() {
		return "SavingsAccount [minimumBalance=" + minimumBalance + ", Balance=" + getBalance() + ", Name="
				+ getName() + ", tAccount Number=" + getAccountNumber() +  "]";
	}

}
