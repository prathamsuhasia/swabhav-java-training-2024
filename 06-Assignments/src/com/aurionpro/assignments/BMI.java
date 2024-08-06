package com.aurionpro.assignments;

import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float weight, height;

		System.out.println("Enter weight in Kilograms");
		weight = sc.nextFloat();

		System.out.println("Enter heigh in meteres");
		height = sc.nextFloat();

		float bmi = weight / (height * height);

		System.out.println("Body mass index (BMI) is " + bmi);
	}
}
