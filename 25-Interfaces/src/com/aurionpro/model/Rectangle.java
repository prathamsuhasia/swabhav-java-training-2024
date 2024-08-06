package com.aurionpro.model;

public class Rectangle implements Shape{
private int lenght;
private int breadth;
public Rectangle(int lenght, int breadth) {
	
	this.lenght = lenght;
	this.breadth = breadth;
}
@Override
public void area() {
	System.out.println("Area of rectangle is" + (lenght*breadth));
	
}

}
