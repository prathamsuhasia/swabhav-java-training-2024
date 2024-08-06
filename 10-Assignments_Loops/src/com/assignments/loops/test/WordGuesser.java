package com.assignments.loops.test;

import java.util.Random;
import java.util.Scanner;

public class WordGuesser {
	public static void main(String[] args) {
		String[] words = { 
			    "hello", "brain", "crime", "chain", "break", "cross", "bread", 
			    "planet", "galaxy", "universe", "freedom", "journey", "harmony", 
			    "victory", "adventure", "mystery", "fortune", "biology", "physics", 
			    "chemistry", "computer", "horizon", "library", "history", "biology" 
			};

		Random rndm = new Random();
		int randomNumber = rndm.nextInt(25);
		String randomWord = words[randomNumber];

		Scanner sc = new Scanner(System.in);
		
		
		char[] randomWordArray = new char[randomWord.length()];
		for (int i = 0; i < randomWord.length() ; i++) {
			randomWordArray[i] = randomWord.charAt(i);
		}
		char[] blankArray = new char[randomWord.length()];
		for(int i=0 ; i < randomWord.length();i++) {
			blankArray[i] ='_';
		}
		
		int  letterCount=1;
		char guessedCharacter;
		int attempts = randomWord.length()*3, count = 0;
		while (count < attempts) {
			for(int i =0 ; i < randomWord.length() ;i++ ) {
				if (blankArray[i]!= '_') {
					letterCount++;
				}
				
			}
			if (letterCount==randomWord.length()) {
				break;
			}
			letterCount=0;
			
			System.out.println("Guess a character");
			guessedCharacter = sc.next().charAt(0);
			for (int i = 0; i < randomWord.length(); i++) {
				if (guessedCharacter == randomWordArray[i]) {
					blankArray[i] =guessedCharacter;

				}
			}
			for (int i = 0 ; i<randomWord.length(); i++) {
				System.out.print(blankArray[i] + "\t");
			}
			System.out.println();
			count++;

		}
		if(count>= attempts) {
			System.out.println("You exhausted your attempts");
		}
		else {
			System.out.println("you won the game in " + count +" guesses");
		}

	}
}
