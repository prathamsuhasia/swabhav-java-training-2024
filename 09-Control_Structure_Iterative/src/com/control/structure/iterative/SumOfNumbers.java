package com.control.structure.iterative;

import java.util.Scanner;

public class SumOfNumbers {
	public static void main(String[] args) {
		
		int number,sum=0,i=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		number = sc.nextInt();
		
		while (i<=number) {
			 sum +=i;
			 i++;
		}
		System.out.println("Sum of first " + number + " number is " +sum);
	}
}
