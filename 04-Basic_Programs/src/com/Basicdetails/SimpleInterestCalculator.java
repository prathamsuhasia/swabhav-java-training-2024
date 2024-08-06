package com.Basicdetails;
import java.util.Scanner;
public class SimpleInterestCalculator {
	public static void main(String[] args) {
		double principalAmount,rateOfInterest,simpleInterest;
		int numberOfYears;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal amount");
		principalAmount = sc.nextDouble();
		
		System.out.println("Enter Rate of interest");
		rateOfInterest = sc.nextDouble();
		
		System.out.println("Enter Number of years");
		numberOfYears = sc.nextInt();
		
		simpleInterest= (principalAmount * rateOfInterest * numberOfYears) / 100;
		System.out.println("Simple interest is " + simpleInterest);
		
		
		
		
	}
}
