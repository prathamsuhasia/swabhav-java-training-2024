package com.swabahav.test;

import java.util.Scanner;

public class PeakNumberFinder {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter size of array: " );
		int size = sc.nextInt();
		int array[] = new int[size];
		
		for (int i = 0; i < size ; i++) {
			System.out.print("Enter array element: ");
			array[i] = sc.nextInt();
		}
		int count =0;
		int peakNumbers[] = new int[size];
		
//		if(array[0] > array[1]) {
//			peakNumbers[count] = array[0] ; 
//			count++;
//		}
//		
		for (int i =1 ; i<size-1 ; i++) {
			if (array[i] >= array[i-1] && array[i] >= array[i+1]) {
				peakNumbers[count] = array[i] ; 
				count ++;
			}
			
		}
		
//		if(array[size-1] > array[size-2]) {
//			peakNumbers[count] = array[size-1] ; 
//			count++;
//		}
		System.out.println("Peak numbers are:");
		for(int i =0 ; i<count ; i++) {
			System.out.print(peakNumbers[i] + "\t");
		}
	}
}
