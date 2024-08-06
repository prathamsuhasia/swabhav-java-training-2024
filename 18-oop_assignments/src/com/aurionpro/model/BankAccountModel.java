package com.aurionpro.model;



public class BankAccountModel {
	private int accountNumber;
	private String name;
	private double balance;
	private String accountType;
	
	
	public BankAccountModel(int accountNumber, String name, double balance,String accountType) {
		this.accountNumber= accountNumber;
		this.name =name;
		this.balance= balance;
		this.accountType = accountType;
		
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber){
		this.accountNumber= accountNumber;
	}
	public String getCustomerName() {
		return name;
		
	}
	public void setCustomerName(String name) {
		this.name =name;
	}
	
	public double getCustomerBalance() {
		return balance;
	}
	public void setCustomerBalance(double balance){
		this.balance= balance;
	}
	public String getAccountType () {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType= accountType;
	}
	
	public double deposit(double depositAmount) {
		return balance+depositAmount;
	}
	public double wothdeaw(double withdrawAmount) {
		return balance+withdrawAmount;
	}
}
