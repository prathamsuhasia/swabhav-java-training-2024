package com.conditional.statements;

import java.util.Scanner;

public class PositiveNegative {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number1;
		System.out.println("Enter the first number");
		number1 = sc.nextInt();


		if (number1 < 0) {
			System.out.println("Number is negative");

		}
		else if(number1>0){
			System.out.println("Number is positive");
		}
		else if(number1==0) {
			System.out.println("number is 0");
		}
	}
}
