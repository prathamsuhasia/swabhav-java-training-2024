package com.commandLineArgs;

public class AreaCalculator {
	public static void main(String[] args) {
	double radius=Double.parseDouble(args[0]);
	final double pi =3.14;
	double areaOfCircle= pi * radius *radius;
	
	System.out.println("Area Of circle is " + areaOfCircle);
	
	}
}
