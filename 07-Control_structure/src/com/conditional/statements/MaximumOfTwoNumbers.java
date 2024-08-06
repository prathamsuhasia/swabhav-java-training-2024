package com.conditional.statements;

import java.util.Scanner;

public class MaximumOfTwoNumbers {
	public static void main(String[] args) {
		int number1, number2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		number1 = sc.nextInt();

		System.out.println("Enter the Second number");
		number2 = sc.nextInt();

		if (number1 > number2) {
			System.out.println("Maximum number is number1 and minimum number is number2");
		} else if (number2 > number1) {
			System.out.println("Maximum number is number2 and minimum number is number1");
		}

	}
}
