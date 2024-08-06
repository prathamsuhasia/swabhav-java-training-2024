package com.aurionpro.test;

import java.util.function.BiPredicate;

public class BiPredicateTest {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> greaterNumberChecker = (Integer number1 , Integer number2) -> (number1>number2);
		
		if(greaterNumberChecker.test(5, 10)) {
			System.out.println("Number1 is greater");
			return;
		}
		
			System.out.println("number2 is greater");
		
	}
}
