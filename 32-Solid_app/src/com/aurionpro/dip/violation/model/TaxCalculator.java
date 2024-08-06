package com.aurionpro.dip.violation.model;

public class TaxCalculator {
	private DBLogger dblogger;

	public TaxCalculator(DBLogger dblogger) {
		super();
		this.dblogger = dblogger;
	}
	
	public int calculateInterest() {
		dblogger = new DBLogger(10000, 0);
		int tax=0;
		try {
			tax = dblogger.getAmount()/dblogger.getRateOfInterest();
		}
		catch(Exception exception) {
			new DBLogger().log("Divide by Zero");
		}
		
		return tax;
		
	}
}
