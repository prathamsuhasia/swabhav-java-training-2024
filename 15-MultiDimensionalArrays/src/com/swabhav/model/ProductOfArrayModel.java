package com.swabhav.model;

public class ProductOfArrayModel {
	public static int[] productuctExceptSelf(int[] array) {
		int n = array.length;
		int[] product = new int[n];
		int zeroCount = 0;
		int totalproductuct = 1;

		for (int i = 0; i < n; i++) {
			if (array[i] == 0) {
				zeroCount++;
			} else {
				totalproductuct *= array[i];
			}
		}

		if (zeroCount > 1) {
			for (int i = 0; i < n; i++) {
				product[i] = 0;
			}
			return product;
		}

		for (int i = 0; i < n; i++) {
			if (zeroCount == 1) {
				if (array[i] == 0) {
					product[i] = totalproductuct;
				} else {
					product[i] = 0;
				}
			} else {
				product[i] = totalproductuct / array[i];
			}
		}

		return product;
	}

}
