package com.swabhav.test;

import java.util.Scanner;
import com.swabhav.model.ProductOfArrayModel;
public class ProductOfArray {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array");
		
		int size = scanner.nextInt();
		int array[] = new int[size];
		
		for (int i = 0; i < size; i++) {
			System.out.println("Enter array element");
		
			array[i] = scanner.nextInt();
		}
		
		int product[] = new int[size];
		
		product = ProductOfArrayModel.productuctExceptSelf(array);
		
		System.out.println("productuct of except self is: ");
		System.out.print(java.util.Arrays.toString(product));

	}



}
