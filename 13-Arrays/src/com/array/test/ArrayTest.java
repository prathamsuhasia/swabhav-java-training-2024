package com.array.test;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter size");
		int size = scanner.nextInt();
		int array[];
		array = new int[size];
		
		for(int i = 0; i< size; i++) {
			System.out.println("Enter a number");
			array[i] = scanner.nextInt(); 
		}
		
		System.out.println("Array is");
		for (int i = 0; i < size ; i++) {
			System.out.print(array[i] + "\t");
		}
	}
}
