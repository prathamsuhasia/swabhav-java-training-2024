package com.aurionpro.operators;

import java.util.Scanner;

public class LogicalOperator {
	public static void main(String[] args) {

		boolean condition1, condition2;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first boolean value (true/false)");
		condition1 = sc.nextBoolean();
		System.out.println("First boolean value is " + condition1);

		System.out.println("Enter the second boolean value (true/false)");
		condition2 = sc.nextBoolean();
		System.out.println("Second boolean value is " + condition2);

		boolean andResult = condition1 && condition2;
		System.out.println("condition1 && condition2: " + andResult);

		boolean orResult = condition1 || condition2;
		System.out.println("condition1 || condition2: " + orResult);

		boolean notCondition1 = !condition1;
		boolean notCondition2 = !condition2;
		System.out.println("!condition1: " + notCondition1);
		System.out.println("!condition2: " + notCondition2);
	}
}
