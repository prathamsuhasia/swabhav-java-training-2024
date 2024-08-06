package com.swabahav.test;

import java.util.Scanner;

import java.util.Scanner;

public class DuplicatesInArrayChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter array element");
            array[i] = sc.nextInt();
        }

        if (hasDuplicates(array)) {
            System.out.println("The array has duplicate elements.");
        } else {
            System.out.println("The array has no duplicate elements.");
        }
    }

    public static boolean hasDuplicates(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}

