package com.assignments.loops.test;

import java.util.Scanner;

public class PrimeNumberPatternGenerator {
	public static void main(String[] args) {
		int numberOfRows;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows to be displayed in pattern: ");
		numberOfRows = sc.nextInt();
		int number = 2;
		for (int i = 0; i <= numberOfRows; i++) {
			for (int j = 0; j < i; j++) {
				while (true) {
					if (isPrime(number)) {
						System.out.print(number + "\t");
						number++;
						break;
					}
					number++;
				}
				
			}
			System.out.println();
		}

	}

	private static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}

}
