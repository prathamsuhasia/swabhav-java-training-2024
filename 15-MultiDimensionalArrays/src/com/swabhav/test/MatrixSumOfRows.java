package com.swabhav.test;

import java.util.Scanner;

public class MatrixSumOfRows {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of rows");
		int rows = sc.nextInt();

		System.out.println("Enter number of columns");
		int columns = sc.nextInt();

		int matrix[][] = new int[rows][columns];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.println("Enter matrix[" + (i + 1) + "][" + (j + 1) + "] element of matrix");
				matrix[i][j] = sc.nextInt();
			}
		}
		int sum[] = new int[rows];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				sum[i] = sum[i] + matrix[i][j];
			}
		}

		for (int i = 0; i < rows; i++)
			System.out.println("Sum of row  " + (i + 1) + " is " + sum[i]);

	}
}