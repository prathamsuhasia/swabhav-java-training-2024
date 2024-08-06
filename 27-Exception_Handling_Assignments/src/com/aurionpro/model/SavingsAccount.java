package com.aurionpro.model;

import com.aurionpro.exceptions.MinimumBalanceException;

public class SavingsAccount extends BankAccounAPP {

	private double minimumBalance =1000;
	
	public SavingsAccount( double balance, String name, int accountNumber) {
		super(balance, name, accountNumber);
		
	}

	public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	
	public void credit(int depositAmount) {
		if(depositAmount<=0) {
			System.out.println("You cant deposit that amount");
			return;
		}
		this.setBalance(getBalance() + depositAmount);
	}
	
	public void withdraw(double withdrawAmount) {
		if  (withdrawAmount<0) {
			System.out.println("You cant withdraw that amount");
			return;
		}
		if ((this.getBalance()- withdrawAmount) < this.getMinimumBalance() ) {

			throw new MinimumBalanceException(this.getBalance());
	
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
