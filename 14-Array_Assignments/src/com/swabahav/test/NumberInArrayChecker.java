package com.swabahav.test;

import java.util.Scanner;

public class NumberInArrayChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isNumberPresent =false;
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		int array[] = new int[size];
		for(int i =0; i<size; i++) {
			System.out.println("Enter array element");
			array[i]= sc.nextInt();
		}
		System.out.println("Enter a number to check if it is in array");
		int number  = sc.nextInt();
		for(int i =0 ; i< size;i++) {
			
			if(number == array[i]) {
				 isNumberPresent = true;
			}
			
		}
		if (isNumberPresent) {
			System.out.println("It is present in array");
		}
		else {
			System.out.println("Number is not present");
		}
	}
}
