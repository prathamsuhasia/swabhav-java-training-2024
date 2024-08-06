package com.Basicdetails;
import java.util.Scanner;

public class SumOfNumbers {
	public static void main(String[] args) {
		int n1,n2,sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		n1 = sc.nextInt();
		System.out.println("First number is " + n1);
		System.out.println("Enter Second number");
		n2 = sc.nextInt();
		System.out.println("Second number is " + n2);
		
		sum= n1+n2;
		System.out.println("Addition of " + n1 + " and " +n2 +" is " + sum);
	}

}
