package com.conditional.statements;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number1;
		System.out.println("Enter the first number");
		number1 = sc.nextInt();


		if (number1 % 2 == 0) {
			System.out.println("Number is even");

		}
		else {
			System.out.println("Number is odd");
		}
	}
}
