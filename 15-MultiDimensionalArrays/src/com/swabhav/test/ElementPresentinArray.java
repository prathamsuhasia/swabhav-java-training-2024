package com.swabhav.test;

import java.util.Scanner;

public class ElementPresentinArray {
	public static void main(String[] args) {
	Scanner  sc =  new Scanner(System.in);
		
		System.out.println("Enter number of rows");
		int rows = sc.nextInt();
		
		System.out.println("Enter number of columns");
		int columns = sc.nextInt();
		
		int matrix[][]= new int[rows][columns];
		
		for (int i = 0; i < rows; i++) {
		    for (int j = 0; j < columns; j++) {
		        System.out.println("Enter matrix[" + (i+1) + "][" + (j+1) + "] element of matrix");
		        matrix[i][j]= sc.nextInt();
		    }
		}
		System.out.println("Enter a number");
		int number = sc.nextInt();
		for (int i = 0; i < rows; i++) {
		    for (int j = 0; j < columns; j++) {
		        if (number == matrix[i][j]) {
		        	System.out.println("Element Found at matrix[" + (i+1) + "] [ "+ (j+1) + "]");
		        }
		    }
		}
		
	}
}
