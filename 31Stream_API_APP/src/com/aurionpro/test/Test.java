package com.aurionpro.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(20,10,30,4,6,7,8,9,45,65);
		
		Stream<Integer> numberStream =  numbers.stream();
		
//		numberStream.forEach((number)-> System.out.println(number));
//		
//		numbers.stream()
//			.forEach((number)-> System.out.println(number));
//		
//		List<Integer> filteredNumbers= numbers.stream()
//			.filter((number)-> (number%2!=0))
//			.filter((number)-> (number>35))
//			.collect(Collectors.toList());
//		
//		filteredNumbers.stream()
//			.forEach((number)->System.out.println(number));
		
		List<Integer> squareNumber = numbers.stream()
			   .map((number)-> number*number)
			   .collect(Collectors.toList());
//		squareNumber.stream()
//					.forEach((number)->System.out.println(number));
//		
		int addition = numbers.stream()
							  .reduce(0, (number1,number2)->number1+number2);
		System.out.println(addition);
//		
//		numbers.stream()
//			   .sorted()
//			   .forEach((number)->System.out.println(number));
//		
//		numbers.stream()
//	       .sorted(Comparator.reverseOrder())
//	       .limit(3)
//	       .forEach(number -> System.out.println(number));
		
		Optional<Integer> maximum =  numbers.stream().max((number1,number2)->number1-number2);
		
		if(maximum.isPresent()) {
			System.out.println(maximum.get());
		}

	}
}
