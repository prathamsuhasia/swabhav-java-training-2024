package com.aurionpro.test;

import java.util.Scanner;
import com.aurionpro.model.RefactoredPIGDiceGameModel;

public class RefactoredPIGDiceGame {
	public static void main(String[] args) {
		RefactoredPIGDiceGameModel game = new RefactoredPIGDiceGameModel();
		Scanner scanner = new Scanner(System.in);

		while (game.getTotalScore() < 20) {
			printTurn(game);

			System.out.println("Roll or Hold? (r/h): ");
			char rollOrHold = scanner.next().charAt(0);

			if (rollOrHold == 'r') {
				handleRoll(game);
				continue;
			}

			handleHold(game);

		}

		System.out.println("You finished in " + game.getTurn() + " turns!!");
		scanner.close();
	}

	private static void printTurn(RefactoredPIGDiceGameModel game) {
		if (game.isTurnEnded()) {
			System.out.println("\n\nTurn: " + game.getTurn());
		}
	}

	private static void handleRoll(RefactoredPIGDiceGameModel game) {
		game.rollDice();
		System.out.println("Die: " + game.getDice());

		if (game.getDice() == 1) {
			System.out.println("Turn over. No score for this turn");
			game.resetTurnScore();
			game.endTurn();
			game.nextTurn();
			return;
		}
		game.addTurnScore(game.getDice());
		game.continueTurn();

	}

	private static void handleHold(RefactoredPIGDiceGameModel game) {
		System.out.println("Score for turn: " + game.getTurnScore());
		game.addTotalScore(game.getTurnScore());
		System.out.println("Total Score: " + game.getTotalScore());

		game.resetTurnScore();
		game.endTurn();
		game.nextTurn();
	}
}
