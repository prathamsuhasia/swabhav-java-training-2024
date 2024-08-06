package com.swabahav.test;

import java.util.Scanner;

public class PrimeNumberPrinter {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		int array[] = new int[size];
		for(int i =0; i<size; i++) {
			System.out.println("Enter array element");
			array[i]= sc.nextInt();
		}
		System.out.println("Priime numbers are: ");
		for(int i =0; i <size ; i++) {
			if(isPrime(array[i])) {
				System.out.print(array[i] + "\t");
				
			}
		}
		
	}
	private static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}
}
