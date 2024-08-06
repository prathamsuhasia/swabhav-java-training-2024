package com.conditional.statements;

import java.util.Scanner;

public class SeasonChecker {
	public static void main(String[] args) {
		int numberOfMonth;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter month number");
		numberOfMonth= sc.nextInt();
		
		switch(numberOfMonth)
		{
		case (2):
		case (3):
		case (4):
		case (5):System.out.println("Season is summer");
		break;
		case (6):
		case (7):
		case (8):
		case (9):System.out.println("Season is monsoon");
		break;
		case (10):
		case (11):
		case (12):
		case (1):System.out.println("Season is winter");
		break;
		default:System.out.println("wrong input");
		}
	}
}
