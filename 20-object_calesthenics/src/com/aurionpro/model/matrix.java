package com.aurionpro.model;

import java.util.Scanner;

public class matrix {
	public static void main(String[] args) {
		Scanner scanner=  new Scanner(System.in);
		int matrix[][] = new int[3][3];
		System.out.println("Enter array elements");
		
		createRows(matrix,scanner);
		System.out.println("Matrix is : ");
		printMatrix(matrix);
	}

	private static void printMatrix(int[][] matrix) {
		// TODO Auto-generated method stub
		for(int rows=0; rows <3 ; rows++) {
			printRows(matrix,rows);
			
			System.out.println();
		}
		
	}

	private static void printRows(int[][] matrix, int rows) {
		// TODO Auto-generated method stub
		for(int j = 0 ; j< 3; j++) {
			System.out.print(matrix[rows][j]+"\t");
		}
		
	}

	private static void createRows(int[][] matrix, Scanner scanner) {
		for (int row = 0 ; row< 3; row++) {
			getRowElements(matrix,scanner,row);
		}
		
	}

	private static void getRowElements(int[][] matrix, Scanner scanner, int row) {
		for(int j=0 ; j< 3; j++) {
			matrix[row][j] = scanner.nextInt();
		}
		
	}
}
