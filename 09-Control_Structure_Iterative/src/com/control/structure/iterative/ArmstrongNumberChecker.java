package com.control.structure.iterative;

import java.util.Scanner;

public class ArmstrongNumberChecker {
	public static void main(String[] args) {
		int sum = 0, remainder, number;
		int temp, power = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");
		number = sc.nextInt();
		temp = number;

		while (number > 0) {
			power++;
			number = number / 10;
		}
		number = temp;
		while (number > 0) {
			remainder = number % 10;
			sum = (int) (sum + Math.pow(remainder, power));
			number = number / 10;

		}
		if (temp == sum) {
			System.out.println("It is an armstrong number");
		} else {
			System.out.println("It is not an armstrong number ");
		}
	}
}
