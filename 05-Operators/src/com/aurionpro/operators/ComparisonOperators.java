package com.aurionpro.operators;

import java.util.Scanner;

public class ComparisonOperators {
	public static void main(String[] args) {

		int number1, number2;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first number");
		number1 = sc.nextInt();
		System.out.println("First number is " + number1);

		System.out.println("Enter the second number");
		number2 = sc.nextInt();
		System.out.println("Second number is " + number2);

		boolean isEqual = (number1 == number2);
		System.out.println("number1 == number2: " + isEqual);

		boolean isNotEqual = (number1 != number2);
		System.out.println("number1 != number2: " + isNotEqual);

		boolean isGreaterThan = (number1 > number2);
		System.out.println("number1 > number2: " + isGreaterThan);

		boolean isLessThan = (number1 < number2);
		System.out.println("number1 < number2: " + isLessThan);

		boolean isGreaterThanOrEqual = (number1 >= number2);
		System.out.println("number1 >= number2: " + isGreaterThanOrEqual);

		boolean isLessThanOrEqual = (number1 <= number2);
		System.out.println("number1 <= number2: " + isLessThanOrEqual);
	}
}
