package com.swabahav.test;

import java.util.Scanner;

import com.swabahav.model.ArrayElementsSquared;

public class ArrayElementsSquarer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int size = sc.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter array element:");
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (array[j] > array[j + 1]) {

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        int squaredArray [] = ArrayElementsSquared.squaringArrayElements(array);
        System.out.println("Squared array is:");
        for (int i = 0; i < size; i++) {
            System.out.print(squaredArray[i] + "\t");
        }
    }

}
