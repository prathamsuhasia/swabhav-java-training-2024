package com.aurionpro.test;

import com.aurionpro.model.Box;

public class BoxTest {
	public static void main(String[] args) {
		Box box1 = new Box(10,20,30);
		System.out.println("\nFor box 1\n");
		
//		box1.setWidth(10);
//		box1.setHeight(20);
//		box1.setDepth(30);
		
		System.out.println("Height : " + box1.getHeight());
		System.out.println("Depth: "  + box1.getDepth());
		System.out.println("width : " + box1.getWidth());
		
		
		System.out.println("Area For Box1: " + box1.calculateArea() );



	}
}
