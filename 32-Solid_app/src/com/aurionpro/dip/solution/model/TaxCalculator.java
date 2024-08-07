package com.aurionpro.dip.solution.model;


public class TaxCalculator {
	
	private ILogger iLogger;
	private int amount = 10000;
	private int rateOfInterest = 0;
	public TaxCalculator(ILogger iLogger) {
		super();
		this.iLogger = iLogger;
	}
	
	
	public TaxCalculator() {
		super();
	}


	public int calculateInterest() {
		
		int tax=0;
		try {
			tax = amount/rateOfInterest;
		}
		catch(Exception exception) {
			iLogger.error();
		}
		
		return tax;
		
	}

}
