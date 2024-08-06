package com.control.structure.iterative;

import java.util.Scanner;

public class NumberPallindromeChecker {
	public static void main(String[] args) {
		int reverse = 0, remainder, number;
		int temp, power = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");
		number = sc.nextInt();
		temp = number;
		while (number > 0) {
			remainder = number % 10;
			reverse = (reverse * 10) + remainder;
			number = number / 10;

		}
		number = temp;
		if (temp == reverse) {
			System.out.println("Number is pallindrome");
		} else {
			System.out.println("Number is not pallindrome");
		}
	}
}
