package com.conditional.statements;

import java.util.Scanner;

public class TemperatureConvertor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter temperature: ");
		double temperature = sc.nextDouble();

		System.out.println("Choose conversion:");
		System.out.println("1. Celsius to Fahrenheit");
		System.out.println("2. Fahrenheit to Celsius");
		System.out.println("3. Celsius to Kelvin");
		System.out.println("4. Kelvin to Celsius");
		System.out.println("5. Fahrenheit to Kelvin");
		System.out.println("6. Kelvin to Fahrenheit");

		int choice = sc.nextInt();
		double farhenheit, celcius, kelvin;
		switch (choice) {
		case 1:
			System.out.println("Enter temperature in celcius");
			celcius = sc.nextDouble();
			farhenheit = (celcius * 9 / 5) + 32;
			System.out.println("Converted temperature is " + farhenheit);
			break;
		case 2:
			System.out.println("Enter temperature in farhenheit");
			farhenheit = sc.nextDouble();
			celcius = (farhenheit - 32) * 5 / 9;
			System.out.println("Converted temperature is " + farhenheit);
			break;
		case 3:
			System.out.println("Enter temperatur in celcius");
			celcius = sc.nextDouble();
			kelvin = celcius + 273.15;
			System.out.println("temperature in kelvin is" + kelvin);
			break;
		case 4:
			System.out.println("Enter temperatur in kelvin");
			kelvin = sc.nextDouble();
			celcius = kelvin - 273.15;
			System.out.println("temperature in celcius is" + celcius);
			break;
		case 5:
			System.out.println("Enter temperature in farhenheit");
			farhenheit = sc.nextDouble();
			kelvin = (farhenheit - 32) * 5 / 9 + 273.15;
			System.out.println("Temperature in kelvin is " + kelvin);
			break;
		case 6:
			System.out.println("Enter temperatur in kelvin");
			kelvin = sc.nextDouble();
			farhenheit = (kelvin - 273.15) * 9 / 5 + 32;
			System.out.println("Temperature in kelvin");
			break;
		default:
			System.out.println("Wrong choice");

		}

	}
}
