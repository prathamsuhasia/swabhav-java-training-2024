package com.aurionpro.model;

public class Triangle  implements Shape{
private int height ;
private int base;
public Triangle(int height, int base) {
	super();
	this.height = height;
	this.base = base;
}
@Override
public void area() {
	System.out.println("Area of rectangle is " + (0.5 * base * height));
	
}



}
