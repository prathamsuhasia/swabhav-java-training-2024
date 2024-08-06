package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.AreaCalculatorModel;

public class AreaCalculatorTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius of the circle");
		double radius = sc.nextDouble();
		
		AreaCalculatorModel acm = new AreaCalculatorModel(radius);

		
		

		System.out.println(acm.calculateArea());

	}
}
