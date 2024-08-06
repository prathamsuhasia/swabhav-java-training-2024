package com.control.structure.iterative;

import java.util.Scanner;

public class SumOfDigitsOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		System.out.println("Enter a number");
		int number = sc.nextInt();

		while (number > 0) {
			sum += number % 10;
			number = number / 10;
		}
		System.out.println("Sum of digits is " + sum);
		sc.close();
	}
}
