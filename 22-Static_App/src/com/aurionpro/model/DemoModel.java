package com.aurionpro.model;

// we can only create a static class when it is inside some other class
public class DemoModel {

	// static keyword are used when we need a variable that needs value to be
	// consistent throughout the program
	private int a = 1;
	// private int b =1
	private static int b = 1;
	private int c = 1;

	// static method cannot be called with the object you can access it with class
	// name
	public void increment() {
		a++;
		b++;
		c++;
	}

	public void display() {
		System.out.print("a=" + a + "\t");
		System.out.print("b=" + b + "\t");
		System.out.println("c=" + c);
	}

	// normal blocks are executed when a object is created
	{
		System.out.println("pratham");
	}
}
