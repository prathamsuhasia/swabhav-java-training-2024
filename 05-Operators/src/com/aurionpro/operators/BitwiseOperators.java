package com.aurionpro.operators;

import java.util.Scanner;

public class BitwiseOperators {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int number1,number2;
	
	System.out.println("Enter the first number");
	number1 = sc.nextInt();
	System.out.println("First number is " + number1);

	System.out.println("Enter the Second number");
	number2 = sc.nextInt();
	System.out.println("Second number is " + number2);
	
	System.out.println("bitwise and operation " + (number1 & number2) );
	System.out.println("bitwise or operation " + (number1 | number2) );
	System.out.println("bitwise Right shift operation " + (number1 >> 1) );
	System.out.println("bitwise Left shift  operation " + (number1 << 1) );
	
	
	}
}
