package com.swabahav.model;

public class ArrayElementsSquared {
	
	
	
	public static int[] squaringArrayElements( int array[]) {
		int squaredArray[] = new int[array.length];
		for(int i =0; i < array.length; i++) {
			squaredArray[i] = array[i] * array[i] ;
			
		}
		
		return squaredArray;
		
	}

}
