package com.commandLineArgs;

public class Swap1 {
	public static void main(String[] args) {
		int number1 = Integer.parseInt(args[0]);
		int number2 = Integer.parseInt(args[1]);
		int temp;
		System.out.println("First number is " + number1);
		System.out.println("Second number is " + number2);

		temp = number1;
		number1 = number2;
		number2 = temp;

		System.out.println("Value of number1 after swapping is  " + number1
				+ " and  value of number2 after swapping is " + number2);

	}
}