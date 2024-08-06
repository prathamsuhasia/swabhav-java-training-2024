package com.aurionpro.dip.violation.model;

public class DBLogger {
	private int amount;
	private int rateOfInterest;
	private String error;
	public DBLogger() {

	}

	public DBLogger(int amount, int rateOfInterest) {
		super();
		this.amount = amount;
		this.rateOfInterest = rateOfInterest;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(int rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	public void log(String error) {
		this.error = error;
		System.out.println(error);
		

	}
}