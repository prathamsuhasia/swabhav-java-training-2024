package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.exceptions.AgeNotValidException;
import com.aurionpro.model.Voter;

public class VoterTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter voter id");
		int voterID = scanner.nextInt();
		System.out.println("Enter First name");
		String firstName = scanner.next();
		System.out.println("Enter last name");
		String lastName = scanner.next();
		System.out.println("Enter Age");
		int age = scanner.nextInt();
		Voter voter = null;
		try {
			Voter voter1 = new Voter(voterID, firstName, lastName, age);
			
		}
		catch(AgeNotValidException exception) {
			System.out.println(exception.getMessage());
		}
		System.out.println(voter);

	}
}
