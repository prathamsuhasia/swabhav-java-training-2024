package com.conditional.statements;

import java.util.Scanner;

public class VowelChecker {
	public static void main(String[] args) {
		char character;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character");
		character = sc.next().charAt(0);
		if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
			System.out.println("Character is a vowel");

		}
		else {
			System.out.println("Character is not a vowel");
		}

	}
}
