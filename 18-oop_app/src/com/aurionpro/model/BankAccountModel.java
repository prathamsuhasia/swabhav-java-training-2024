package com.aurionpro.model;

public class BankAccountModel {
	private int accountNumber;
	private String name;
	private double balance;
	
	
	
	public BankAccountModel(int an, String n, double b) {
		accountNumber= an;
		name =n;
		balance= b;
		
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int an){
		accountNumber= an;
	}
	public String getCustomerName() {
		return name;
		
	}
	public void setCustomerName(String n) {
		name =n;
	}
	
	public double getCustomerBalance() {
		return balance;
	}
	public void setCustomerBalance(double b){
		balance= b;
	}
	
	public double deposit(double depositAmount) {
		return balance+depositAmount;
	}
	public double wothdeaw(double withdrawAmount) {
		return balance+withdrawAmount;
	}
}
