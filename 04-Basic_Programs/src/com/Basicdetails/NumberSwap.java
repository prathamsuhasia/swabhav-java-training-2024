package com.Basicdetails;

import java.util.Scanner;

public class NumberSwap {
	public static void main(String[] args) {
		int number1,number2,temp=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		number1 = sc.nextInt();
		System.out.println("First number is " + number1);
		System.out.println("Enter Second number");
		number2 = sc.nextInt();
		System.out.println("Second number is " + number2);
		
		temp=number1;
		number1=number2;
		number2=temp;
		
		System.out.println("Value of number1 after swapping is  " + number1 + " and  value of number2 after swapping is " + number2);
	}

}
