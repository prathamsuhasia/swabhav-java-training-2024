package com.swabahav.test;

import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int array[] = new int[size];
        for(int i = 0; i < size; i++) {
            System.out.println("Enter array element");
            array[i] = sc.nextInt();
        }


        int start = 0;
        int end = size - 1;
        while (start < end) {

            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }

        System.out.println("Reversed array:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
