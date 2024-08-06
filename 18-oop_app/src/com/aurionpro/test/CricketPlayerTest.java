package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.CricketPlayerModel;

public class CricketPlayerTest {
	public static void main(String[] args) {

		Scanner sc =  new Scanner(System.in);
			
		CricketPlayerModel cricketPlayers[] = new CricketPlayerModel[11];
		
		for (int i = 0 ; i<cricketPlayers.length; i++) {
			System.out.println("Enter player id");
			int playerID =sc.nextInt();
			System.out.println("Enter Player Name");
			String name =  sc.next();
			System.out.println("Enter number of matches");
			int numberOfMatches = sc.nextInt();
			System.out.println("Enter runs");
			int runs =  sc.nextInt();
			System.out.println("Enter wickets");
			int wickets = sc.nextInt();
			
			cricketPlayers[i] = new CricketPlayerModel(playerID, name, numberOfMatches, runs, wickets);
			
			
		}
		for (int i = 0 ; i< cricketPlayers.length; i++) {
			System.out.println("Player id: " + cricketPlayers[i].getPlayerID());
			System.out.println("Name: " + cricketPlayers[i].getName());
			System.out.println("Number of Matches " + cricketPlayers[i].getnNumberOfMatches());
			System.out.println("Runs: " + cricketPlayers[i].getRuns());
			System.out.println("wicket: " + cricketPlayers[i].getWickets());
			System.out.println("Average is " + cricketPlayers[i].calculateAverage());
		}
			
	}
}
