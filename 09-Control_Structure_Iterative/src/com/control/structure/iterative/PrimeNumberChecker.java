package com.control.structure.iterative;

import java.util.Scanner;

public class PrimeNumberChecker {
	public static void main(String[] args) {
		int number, sum = 0;
		Scanner sc = new Scanner(System.in);
		int i = 2;
		System.out.println("Enter a number");
		number = sc.nextInt();
		int temp = number;
		while (i < number) {
	

			if (number % i == 0 ) {
				sum = sum + i;
			}
			i++;

		}

		if(sum==0) {
			System.out.println("it is a  prime number");
		}
		else {
			System.out.println("it is not a prime number");
		}
		
	}
}
