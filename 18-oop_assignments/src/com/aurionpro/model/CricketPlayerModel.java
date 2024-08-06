package com.aurionpro.model;

public class CricketPlayerModel {
	private int playerID;
	private String name;
	private  int numberOfMatches;
	private int runs;
	private int wickets;
	
	public CricketPlayerModel(int playerID, String name, int numberOfMatches, int runs, int wickets) {
		this.playerID= playerID;
		this.name= name;
		this.numberOfMatches = numberOfMatches;
		this.runs= runs;
		this.wickets =wickets;
		
	}
	public int getPlayerID() {
		return playerID;
	}
	public void setPlayerID(int playerID) {
		this.playerID= playerID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name= name;
	}
	public int getnNumberOfMatches() {
		return numberOfMatches;
	}
	public void setNumberOfMatches(int numberOfMatches) {
		this.numberOfMatches = numberOfMatches;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs= runs;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets =wickets;
	}
	
	public double calculateAverage() {
		return runs/numberOfMatches;
	}
	
}
