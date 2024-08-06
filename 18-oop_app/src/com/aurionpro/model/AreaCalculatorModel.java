package com.aurionpro.model;

public class AreaCalculatorModel {
	private double radius;
	final double pi = 3.14;

	
	

	public AreaCalculatorModel(double radius2) {
		radius = radius2;
	}

	public double calculateArea() {
		return pi * radius *radius;
	}
}
