package com.loop.patterns;

public class NumberPyramid2 {
	public static void main(String[] args) {
		int number =1;
		for(int i =0 ; i< 5 ; i++) {
			for (int j =0; j<i; j++) {
				System.out.print(number + "\t");
				number++;
			}
			System.out.println();
		}
	}
}
