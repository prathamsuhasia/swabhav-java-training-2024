package com.assignments.loops.test;

import java.util.Scanner;
import java.util.Random;

public class PIGGame {
	public static void main(String[] args) {

		int turnScore = 0, totalScore = 0;
		int dice;
		char rollOrHold;
		Random rand = new Random();

		Scanner sc = new Scanner(System.in);
		int turn = 1;
		boolean turnEnded = true;
		while (totalScore < 20) {
			if (turnEnded == true) {

				System.out.println("\n\nTurn: " + turn);

			}

			System.out.println("Roll or Hold? (r/h): ");
			rollOrHold = sc.next().charAt(0);
			if (rollOrHold == 'r') {
				dice = rand.nextInt(6) + 1;
				System.out.println("Die: " + dice);

				if (dice == 1) {
					System.out.println("Turn over. No score for this turn");
					turnEnded = true;
					turn++;
					turnScore = 0;
					continue;
				} else {
					turnEnded = false;
					turnScore = turnScore + dice;
				}

			} else {
				System.out.println("Score for turn: " + turnScore);
				totalScore = totalScore + turnScore;
				System.out.println("Total Score: " + totalScore);
				turn++;
				turnScore = 0;
				turnEnded = true;
				continue;
			}

		}

		if (totalScore >= 20) {
			System.out.println("You finished in " + turn + " turns!!");
		}

	}
}
