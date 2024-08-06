package com.aurionpro.operators;

import java.util.Scanner;

public class ArithmeticOperators {
	public static void main(String[] args) {

		int number1, number2;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first number");
		number1 = sc.nextInt();
		System.out.println("First number is " + number1);

		System.out.println("Enter the Second number");
		number2 = sc.nextInt();
		System.out.println("Second number is " + number2);

		int addition = number1 + number2;
		System.out.println("number1 + number2 = " + addition);

		int subtraction = number1 - number2;
		System.out.println("number1 - number2 =" + subtraction);

		int multiplication = number1 * number2;
		System.out.println("number1 * number2 =" + multiplication);

		float division = (float) number1 / (float) number2;
		System.out.println("number1 / number2 =" + division);

		int modulus = number1 % number2;
		System.out.println("number1 % number2 =" + modulus);

		System.out.println("Current value of number1 is " + number1 + " and number2 is " + number2);
		int postfixIncrement = number1++;
		System.out.println("Value of number1 is stored fist  then it is incremented so value of postfixIncrement is  "
				+ postfixIncrement + " and value of number1 is " + number1);

		int prefixIncrement = ++number2;
		System.out.println("The number is incremented first and then store to so value of prefixIncrement is "
				+ prefixIncrement + " and value of number2 is " + number2);

		System.out.println("now value of number1 is " + number1 + " and number2 is " + number2);

		int postfixDecrement = number1--;
		System.out.println("Value of number1 is stored fist  then it is Decremented so value of postfixDecrement is  "
				+ postfixDecrement + " and value of number1 is " + number1);

		int prefixDecrement = --number2;
		System.out.println("The number2 is Decremented first and then store to so value of prefixDecrement is "
				+ prefixDecrement + " and value of number2 is " + number2);

		System.out.println("Final value of number1 is " + number1 + " and number2 is " + number2);

	}
}
