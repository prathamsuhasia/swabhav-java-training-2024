package com.assignments.loops.test;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rndm = new Random();
		int randomNumber, guessedNumber, attempts = 1;
		char choice;
		randomNumber = rndm.nextInt(101);

		System.out.println("Enter a Number:");
		guessedNumber = sc.nextInt();

		while (true) {
			System.out.println("Generated number" + randomNumber);
			if (randomNumber == guessedNumber) {
				System.out.println("you won in " + attempts + " attempts");
				System.out.println("Do you want to play this game again: y/n");
				choice = sc.next().charAt(0);
				if (choice == 'y') {
					randomNumber = rndm.nextInt(101);
					System.out.println("Enter a Number:");
					guessedNumber = sc.nextInt();
					attempts =0;
					continue;

				} else {
					break;
				}

			}
			else if(attempts>5){
				System.out.println("You have exhauset your attempts");
				System.out.println("Do you want to play this game again: y/n");
				choice = sc.next().charAt(0);
				if (choice == 'y') {
					randomNumber = rndm.nextInt(101);
					System.out.println("Enter a Number:");
					guessedNumber = sc.nextInt();
					attempts =0;
					continue;

				} else {
					break;
				}
				
			}
			else if (guessedNumber > randomNumber) {
				System.out.println("Sorry too high");
				System.out.println("Enter your guess");
				guessedNumber = sc.nextInt();
				attempts++;
			} else if (guessedNumber < randomNumber) {
				System.out.println("Sorry too low");
				System.out.println("Enter your guess");
				guessedNumber = sc.nextInt();
				attempts++;
			}

		}

	}
}
