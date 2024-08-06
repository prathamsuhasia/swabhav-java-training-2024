package com.commandLineArgs;

public class SimpleInterestCalc {
public static void main(String[] args) {
	double principalAmount= Double.parseDouble(args[0]);
	double rateOfInterest = Double.parseDouble(args[1]);
	int noOfYears = Integer.parseInt(args[2]);
	
	double simpleInterest = (principalAmount*rateOfInterest*noOfYears)/100;
	
	System.out.println("Simple interest is " + simpleInterest);
}
}
