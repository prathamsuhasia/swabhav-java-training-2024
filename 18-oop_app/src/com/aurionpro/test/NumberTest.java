package com.aurionpro.test;

import com.aurionpro.model.NumberModel;

public class NumberTest {
	public static void main(String[] args) {
		
		NumberModel number1 = new NumberModel(10);
		NumberModel number2 = new NumberModel(20);

		System.out.println("Before Swapping");
		System.out.println("Value of number1 is " + number1.getValue() + "\t Value of number2 is " + number2.getValue());
		
		swap(number1,number2);
		
		
		System.out.println("after Swapping");
		System.out.println("Value of number1 is " + number1.getValue() + "\t Value of number2 is " + number2.getValue());

	}

	private static void swap(NumberModel number1, NumberModel number2) {
		int temp;
		temp = number1.getValue();
		number1.setValue(number2.getValue());
		number2.setValue(temp);
		
		
	}
}
