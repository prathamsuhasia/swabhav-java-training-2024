package com.aurionpro.assignments;

import java.util.Scanner;

public class AreaOfTrapezoid {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the length of the first base (a):");
		double a = scanner.nextDouble();

		System.out.println("Enter the length of the second base (b):");
		double b = scanner.nextDouble();

		System.out.println("Enter the height (h):");
		double h = scanner.nextDouble();

		double area = 0.5 * (a + b) * h;

		System.out.println("The area of the trapezoid is: " + area);

	}
}
