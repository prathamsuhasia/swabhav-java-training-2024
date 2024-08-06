package com.swabahav.test;

import java.util.Scanner;

public class CountEvenNumber {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.println("Enter size of array");
	        int size = sc.nextInt();
	        int array[] = new int[size];
	        for(int i = 0; i < size; i++) {
	            System.out.println("Enter array element");
	            array[i] = sc.nextInt();
	        }
	        int count = 0;
	        int evenNumberArray[] = new int[size];
	        for(int i =0; i< size ; i++) {
	        	if(array[i]%2==0) {
	        		evenNumberArray[count] = array[i];
	        		count++;
	        		
	        	}
	        	
	        }
	        
	        System.out.println("Even number present in array are: " );
	        for(int i =0; i< count ; i++) {
	        	System.out.print(evenNumberArray[i] + "\t");
	        	
	        }
	        System.out.println();
	        System.out.println("Number of even number in present are " + count);
	}
}
