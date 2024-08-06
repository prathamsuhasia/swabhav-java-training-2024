package com.aurionpro.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsUsingString {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("jayesh","nimesh", "mark", "mahesh" , "ramesh");
		
		System.out.println("First 3 in ascending");
		names.stream()
			 .sorted()
			 .limit(3)
			 .forEach((name)->System.out.println(name));
		
		System.out.println("\nContaining a");
		List<String> containingA = names.stream()
		 	 .sorted()
		 	 .filter((name)-> (name.contains("a")))
		 	 .collect(Collectors.toList());
			
		containingA.stream()
					.forEach((name)-> System.out.println(name));
			
		System.out.println("\nReverse order");
		
		names.stream()
		 .sorted(Comparator.reverseOrder())
		 .forEach((name)->System.out.println(name));
	
		 			 
		System.out.println("\nfirst 3 for each name");
		names.stream()
			 .forEach((name)->System.out.println(name.substring(0, 3)));
		
		List<String> nameLessThanFour = names.stream()
	     .filter(name -> name.length() <=4)
	     .collect(Collectors.toList());
		System.out.println("Name containing less than four characters");
		nameLessThanFour.stream()
						.forEach((name)-> System.out.println(name));
			
			 
		
	}
}
