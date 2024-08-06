package com.aurionpro.test;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionTest {
	public static void main(String[] args) {
		Function<Integer, Integer> squareNumber = (Integer number ) ->number*number;
		
		
		
		method(squareNumber);
		
		BiFunction<Integer, Integer, Integer> addition = (Integer number1,Integer number2) -> number1+number2;
		
		System.out.println(addition.apply(5, 10));
		
		
	}
	private static void method(Function<Integer, Integer> squarenumber) {
		System.out.println(squarenumber.apply(5));
		
	}
}
