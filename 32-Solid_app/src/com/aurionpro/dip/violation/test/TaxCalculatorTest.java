package com.aurionpro.dip.violation.test;

import com.aurionpro.dip.violation.model.DBLogger;
import com.aurionpro.dip.violation.model.TaxCalculator;

public class TaxCalculatorTest {
	public static void main(String[] args) {
		DBLogger dblogger= new DBLogger();
		TaxCalculator taxCalculator = new TaxCalculator(dblogger);
		taxCalculator.calculateInterest();
	}
}
