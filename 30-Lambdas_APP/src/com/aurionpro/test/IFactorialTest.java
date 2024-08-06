package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.IFactorial;

public class IFactorialTest {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		IFactorial factorial = (number1) -> {
			int factorialStore =1;
			for(int i =1  ; i<= number1 ;  i++) {
				factorialStore *= i; 
			}
			return factorialStore;
		};
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		System.out.println(factorial.factorial(number));
	}
}
