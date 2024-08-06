package com.conditional.statements;

import java.util.Scanner;

public class VowelCheckerUsingSwitch {
	public static void main(String[] args) {
		char character;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character");
		character = sc.next().charAt(0);
		
		switch (character)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':System.out.println("It is a vowel");
		break;
		default: System.out.println("It is not a vowel");
		
		}
	}

}
