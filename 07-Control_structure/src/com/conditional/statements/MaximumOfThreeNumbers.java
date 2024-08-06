package com.conditional.statements;

import java.util.Scanner;

public class MaximumOfThreeNumbers {
	public static void main(String[] args) {
		int number1, number2, number3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		number1 = sc.nextInt();

		System.out.println("Enter the Second number");
		number2 = sc.nextInt();

		System.out.println("Enter the  third number");
		number3 = sc.nextInt();
		
		if(number1>number2 && number1>number3) {
			System.out.println("Maximum is number1");
			
		}
		else if(number2>number1 && number2>number3) {
			System.out.println("Maximum is number2");
			
		}
		else if(number3>number1 && number3>number2) {
			System.out.println("Maximum is number3");
			
		}
		
	}
}
