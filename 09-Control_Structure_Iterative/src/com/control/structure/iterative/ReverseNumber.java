package com.control.structure.iterative;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		int reverse = 0, remainder, number;
		int temp, power = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");
		number = sc.nextInt();
		temp =number;
		while(number>0) {
			remainder = number %10;
			reverse = (reverse *10 ) + remainder;
			number=number/10;
			
		}
		number =temp;
		System.out.println("number is " + number + " its reverse is " + reverse);
		
	}
}
