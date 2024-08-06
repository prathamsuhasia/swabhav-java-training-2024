package com.swabhav.model;

public class SecondLargestOfAnArrayModel {
	public static void getSecondLargest(int[] array, int array_size) {
		int i, second;

		if (array_size < 2) {
			System.out.printf(" Invalid Input ");
			return;
		}

		int largest = second = Integer.MIN_VALUE;

		for (i = 0; i < array_size; i++) {
			largest = Math.max(largest, array[i]);
		}

		for (i = 0; i < array_size; i++) {
			if (array[i] != largest)
				second = Math.max(second, array[i]);
		}
		if (second == Integer.MIN_VALUE)
			System.out.printf("There is no second " + "largest element\n");
		else
			System.out.printf("The second largest " + "element is %d\n", second);
	}
}
