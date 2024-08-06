package com.aurionpro.test;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class BiConsumerTest {
	public static void main(String[] args) {
		BiConsumer<Integer , Integer>  biConsumer = (Integer number1, Integer number2) -> System.out.println("Addition is: " + (number1+number2));
		
		biConsumer.accept(10, 5);
		
	}
}

