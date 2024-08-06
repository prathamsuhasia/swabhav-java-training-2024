package com.aurionpro.assignments;

import java.util.Scanner;

public class CompoundInterest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the principal amount:");
		double principal = sc.nextDouble();

		System.out.println("Enter the annual interest rate (in %):");
		double rate = sc.nextDouble();

		System.out.println("Enter the number of times interest is compounded per year:");
		int timesCompounded = sc.nextInt();

		System.out.println("Enter the time the money is invested for (in years):");
		double time = sc.nextDouble();

		double amount = principal * Math.pow((1 + (rate / 100) / timesCompounded), timesCompounded * time);
		double compoundInterest = amount - principal;

		System.out.println("Principal amount: " + principal);
		System.out.println("Annual interest rate: " + rate + "%");
		System.out.println("Times interest compounded per year: " + timesCompounded);
		System.out.println("Time period: " + time + " years");
		System.out.println("Compound Interest: " + compoundInterest);
		System.out.println("Amount after " + time + " years: " + amount);
	}
}
