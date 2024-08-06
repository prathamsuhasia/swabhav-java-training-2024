package com.swabhav.test;

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows for first matrix:");
        int rows1 = sc.nextInt();

        System.out.println("Enter number of columns for first matrix:");
        int columns1 = sc.nextInt();

        int matrix1[][] = new int[rows1][columns1];


        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                System.out.println("Enter matrix1[" + (i + 1) + "][" + (j + 1) + "] element:");
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter number of rows for second matrix:");
        int rows2 = sc.nextInt();

        System.out.println("Enter number of columns for second matrix:");
        int columns2 = sc.nextInt();

        int matrix2[][] = new int[rows2][columns2];


        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                System.out.println("Enter matrix2[" + (i + 1) + "][" + (j + 1) + "] element:");
                matrix2[i][j] = sc.nextInt();
            }
        }


        if (rows1 != rows2 || columns1 != columns2) {
            System.out.println("Matrix addition not possible: Matrices must have the same dimensions.");
            System.exit(0);
        }


        int resultMatrix[][] = new int[rows1][columns1];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Resultant Matrix after addition:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                System.out.print(resultMatrix[i][j] + "\t");
            }
            System.out.println(); 
        }

      
    }
}
