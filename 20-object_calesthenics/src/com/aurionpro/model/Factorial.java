package com.aurionpro.model;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Enter a number");
		int number = sc.nextInt();
		int factorial = getFactorial(number);
		if (factorial==-1) {
			System.out.println("factorial of negative number is not possible");
			return;
			
		}
		
		System.out.println("Factorial is " + factorial);
		
		
		
	}

	private static int getFactorial(int number) {
		if (number== 0)
			return 1;
		if (number <0)
			return -1;
		int factorial =1;
		for(int i =1 ; i<number; i++) {
			factorial = factorial*i;
			
		}
		return factorial;
	}
}
