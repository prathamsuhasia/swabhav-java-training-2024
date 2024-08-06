package com.aurionpro.model;

import java.util.Scanner;

public class NestedModuleCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int number1 =  sc.nextInt();
		
		System.out.println("Enter second number");
		int number2 =  sc.nextInt();
		
		addition(number1,number2);
		subtraction(number1,number2);
		
	}

	private static void subtraction(int number1, int number2) {
		
		System.out.println(number1-number2);
		division(number1,number2);
		
	}

	private static int division(int number1, int number2) {
		return number1/number2;
		
	}

	private static int addition(int number1, int number2) {
		multiplication(number1,number2);
		return number1 + number2;
		
	}

	private static int multiplication(int number1, int number2) {
		return number1*number2;
		
	}
	
	
}
