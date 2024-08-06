package com.aurionpro.model;

public class Reference {
	public Reference() {

		System.out.println("inside constructor");
	}

	public static void staticPrint() {
		System.out.println("Inside static");
	}
	public void print() {
		System.out.println("Inside non static");
	}
}
