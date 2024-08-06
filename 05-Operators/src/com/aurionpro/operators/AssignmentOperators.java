package com.aurionpro.operators;

import java.util.Scanner;

public class AssignmentOperators {
	public static void main(String[] args) {

		int number1, number2;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first number");
		number1 = sc.nextInt();
		System.out.println("First number is " + number1);

		System.out.println("Enter the second number");
		number2 = sc.nextInt();
		System.out.println("Second number is " + number2);

		int result;

		result = number2;
		System.out.println("result = " + result + ", number1 = " + number1);
		result = number1;
		System.out.println("result = number1: result = " + result);

		result = number2;
		System.out.println("result = " + result + ", number1 = " + number1);
		result += number1;
		System.out.println("result += number1: result = " + result);

		result = number2;
		System.out.println("result = " + result + ", number1 = " + number1);
		result -= number1;
		System.out.println("result -= number1: result = " + result);

		result = number2;
		System.out.println("result = " + result + ", number1 = " + number1);
		result *= number1;
		System.out.println("result *= number1: result = " + result);

		result = number2;
		System.out.println("result = " + result + ", number1 = " + number1);
		result /= number1;
		System.out.println("result /= number1: result = " + result);

		result = number2;
		System.out.println("result = " + result + ", number1 = " + number1);
		result %= number1;
		System.out.println("result %= number1: result = " + result);
	}
}
