package com.control.structure.iterative;

import java.util.Scanner;

public class PerfectNumberChecker {
	public static void main(String[] args) {
		int number, sum = 0;
		Scanner sc = new Scanner(System.in);
		int i = 1;
		System.out.println("Enter a number");
		number = sc.nextInt();
		int temp = number;
		while (i < number) {

			if (number % i == 0) {
				sum = sum + i;
			}
			i++;
		}

		if (sum == temp) {
			System.out.println("it is a perfect number ");
		} else {
			System.out.println("It is not a perfect number ");
		}
	}
}
