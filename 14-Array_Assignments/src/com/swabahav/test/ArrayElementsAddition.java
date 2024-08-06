package com.swabahav.test;

import java.util.Scanner;

public class ArrayElementsAddition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		int array[] = new int[size];
		for(int i =0; i<size; i++) {
			System.out.println("Enter array element");
			array[i]= sc.nextInt();
		}
		int sum=0;
		for(int i =0 ; i< size;i++) {
			
			sum = sum + array[i];
			
		}
		
		System.out.println("Addition is " + sum);
		
	}
}
