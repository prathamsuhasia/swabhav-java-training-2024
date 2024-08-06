package com.control.structure.test;

import java.util.Scanner;

public class RollercoasterRideBillGenerator {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your height in centimetres");
		double height = sc.nextDouble();
		int charge = 0;
		if (height > 120) {
			System.out.println("Enter your age");
			int age = sc.nextInt();

			if (age < 12) {
				charge = 5;
			} else if (age >= 12 && age < 18) {
				charge = 7;
			} else if (age >= 18 && age < 45) {
				charge = 12;
			} else if (age >= 45 && age <= 55) {
				charge = 0;
			}

			System.out.println("Want Photos \n1. yes \n2.no");
			int wantPhotos = sc.nextInt();

			if (wantPhotos == 1) {
				charge += 3;
			}
			System.out.println("Your bill is " + charge + "$");

		} else {
			System.out.println("You cant ride this rollercoaster");
		}
	}
}
