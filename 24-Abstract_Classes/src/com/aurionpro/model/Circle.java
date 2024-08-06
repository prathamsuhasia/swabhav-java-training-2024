package com.aurionpro.model;

public class Circle extends Shape{
	int radius ;
	public Circle(int radius){
		this.radius= radius;
		
	}
	@Override
	public void area() {
		System.out.println("Area of circle is " + (3.14*radius*radius));
		
	}

}
