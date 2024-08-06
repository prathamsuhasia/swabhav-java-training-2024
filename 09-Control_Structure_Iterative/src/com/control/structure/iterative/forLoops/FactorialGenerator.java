package com.control.structure.iterative.forLoops;

import java.util.Scanner;

public class FactorialGenerator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int factorial=1;
		System.out.println("Enter a number");
		int number = sc.nextInt();
		for(int i =number; i>=1;i--) {
			if(number==0) {
				System.out.println("Factorial of 0 is 1");
			}
			else {
				factorial = factorial * i;
			}
			
		}
		System.out.println("Factoarial is " + factorial);
	}
}
