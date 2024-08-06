package com.aurionpro.model;

import java.util.Random;

public class RefactoredPIGDiceGameModel {
	private int turnScore;
	private int totalScore;
	private int dice;
	private boolean turnEnded;
	private int turn;

	public RefactoredPIGDiceGameModel() {
		this.turnScore = 0;
		this.totalScore = 0;
		this.turnEnded = true;
		this.turn = 1;
	}

	public int getTurnScore() {
		return turnScore;
	}

	public void addTurnScore(int score) {
		this.turnScore += score;
	}

	public void resetTurnScore() {
		this.turnScore = 0;
	}

	public int getTotalScore() {
		return totalScore;
	}

	public void addTotalScore(int score) {
		this.totalScore += score;
	}

	public int getDice() {
		return dice;
	}

	public void rollDice() {
		this.dice = new Random().nextInt(6) + 1;
	}

	public boolean isTurnEnded() {
		return turnEnded;
	}

	public void endTurn() {
		this.turnEnded = true;
	}

	public void continueTurn() {
		this.turnEnded = false;
	}

	public int getTurn() {
		return turn;
	}

	public void nextTurn() {
		this.turn++;
	}
}
