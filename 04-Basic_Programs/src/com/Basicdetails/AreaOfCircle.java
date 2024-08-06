package com.Basicdetails;
import java.util.Scanner;
public class AreaOfCircle {
	public static void main(String[] args) {
		float radius;
		final double area,pi = 3.14;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius:");
		radius = sc.nextFloat();
		
		area = pi* radius*radius;
		System.out.println("Area of the circle is "+ area);
		
		
	}
}
