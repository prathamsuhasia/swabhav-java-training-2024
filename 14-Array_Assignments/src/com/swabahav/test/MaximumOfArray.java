package com.swabahav.test;

import java.util.Scanner;

public class MaximumOfArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		int array[] = new int[size];
		
		for(int i =0; i<size; i++) {
			System.out.println("Enter array element");
			array[i]= sc.nextInt();
		}
		
		int maximum =0 ;
		
		for(int i =0 ; i< size;i++) {
				if(array[i]> maximum) {
					maximum = array[i];
				}	
		}
		
		System.out.println("Maximum is " + maximum );
		
	}

}
