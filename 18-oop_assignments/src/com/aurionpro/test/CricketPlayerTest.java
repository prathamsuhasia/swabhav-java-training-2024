package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.CricketPlayerModel;

public class CricketPlayerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		CricketPlayerModel cricketPlayers[] = new CricketPlayerModel[4];

		for (int i = 0; i < cricketPlayers.length; i++) {
			System.out.println("Enter player id");
			int playerID = sc.nextInt();
			System.out.println("Enter Player Name");
			String name = sc.next();
			System.out.println("Enter number of matches");
			int numberOfMatches = sc.nextInt();
			System.out.println("Enter runs");
			int runs = sc.nextInt();
			System.out.println("Enter wickets");
			int wickets = sc.nextInt();

			cricketPlayers[i] = new CricketPlayerModel(playerID, name, numberOfMatches, runs, wickets);

		}
		for (int i = 0; i < cricketPlayers.length; i++) {
			System.out.println("Player id: " + cricketPlayers[i].getPlayerID());
			System.out.println("Name: " + cricketPlayers[i].getName());
			System.out.println("Number of Matches " + cricketPlayers[i].getnNumberOfMatches());
			System.out.println("Runs: " + cricketPlayers[i].getRuns());
			System.out.println("wicket: " + cricketPlayers[i].getWickets());
			System.out.println("Average is " + cricketPlayers[i].calculateAverage());
		}

		getMaximumAveragePlayer(cricketPlayers);
		displayPlayers(cricketPlayers);

	}

	private static void displayPlayers(CricketPlayerModel[] cricketPlayers) {

		for (int i = 0; i < cricketPlayers.length - 1; i++) {
			for (int j = 0; j < cricketPlayers.length - 1 - i; j++) {
				if (cricketPlayers[j].calculateAverage() > cricketPlayers[j + 1].calculateAverage()) {

					CricketPlayerModel temp = cricketPlayers[j];
					cricketPlayers[j] = cricketPlayers[j + 1];
					cricketPlayers[j + 1] = temp;
				}
			}
		}
		System.out.println("Players in ascending order of averahe");
		for (int i = 0; i < cricketPlayers.length; i++) {
			System.out.println("Player id: " + cricketPlayers[i].getPlayerID());
			System.out.println("Name: " + cricketPlayers[i].getName());
			System.out.println("Number of Matches " + cricketPlayers[i].getnNumberOfMatches());
			System.out.println("Runs: " + cricketPlayers[i].getRuns());
			System.out.println("wicket: " + cricketPlayers[i].getWickets());
			System.out.println("Average is " + cricketPlayers[i].calculateAverage());
		}

	}

	private static void getMaximumAveragePlayer(CricketPlayerModel[] cricketPlayers) {
		CricketPlayerModel maximumAveragePlayer = cricketPlayers[0];
		for (int i = 0; i < cricketPlayers.length; i++) {
			if (cricketPlayers[i].calculateAverage() > maximumAveragePlayer.calculateAverage()) {
				maximumAveragePlayer = cricketPlayers[i];

			}

		}
		System.out.println("Maximum average player");
		System.out.println("Player id:" + maximumAveragePlayer.getPlayerID());
		System.out.println("Name: " + maximumAveragePlayer.getName());
		System.out.println("Number of matches" + maximumAveragePlayer.getnNumberOfMatches());
		System.out.println("Runs:" + maximumAveragePlayer.getRuns());
		System.out.println("Wicket: " + maximumAveragePlayer.getWickets());
		System.out.println("Average is:" + maximumAveragePlayer.calculateAverage());

	}
}
