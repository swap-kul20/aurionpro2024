package com.techlabs.model;

public class CricketPlayer {
	
	private int playerId;
	private String name;
	private int numberOfMatches;
	private int runs;
	private int numberOfWickets;
	
	public CricketPlayer(int playerId, String name, int numberOfMatches, int runs, int numberOfWickets) {
	
		this.playerId = playerId;
		this.name = name;
		this.numberOfMatches = numberOfMatches;
		this.runs = runs;
		this.numberOfWickets = numberOfWickets;
	}
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumberOfMatches() {
		return numberOfMatches;
	}
	public void setNumberOfMatches(int numberOfMatches) {
		this.numberOfMatches = numberOfMatches;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getNumberOfWickets() {
		return numberOfWickets;
	}
	public void setNumberOfWickets(int numberOfWickets) {
		this.numberOfWickets = numberOfWickets;
	}
	
	public double calculateAverage()
	{
		return runs/numberOfMatches;
	}
	
	@Override
	public String toString() {
		return "playerId=" + playerId + ", name=" + name + ", numberOfMatches=" + numberOfMatches
				+ ", runs=" + runs + ", numberOfWickets=" + numberOfWickets + "]";
	}
	
	
	
	

}
