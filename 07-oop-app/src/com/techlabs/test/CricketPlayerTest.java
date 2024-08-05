package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.CricketPlayer;

public class CricketPlayerTest {

	public static void main(String[] args) {


		Scanner scanner=new Scanner(System.in);
		
		CricketPlayer players[]=new CricketPlayer[11];
		
		System.out.println("Enter Details of players");
		
		for(int i=0;i<players.length;i++)
		{
		System.out.println("Enter Player Id: ");
		int playerId=scanner.nextInt();
		System.out.println("Enter Player Name: ");
		String name=scanner.next();
		System.out.println("Enter Number of matches: ");
		int noOfMacthes=scanner.nextInt();
		System.out.println("Enter Runs: ");
		int runs=scanner.nextInt();
		System.out.println("Enter Number of Wickets: ");
		int noOfWickets=scanner.nextInt();
		
		players[i]=new CricketPlayer(playerId,name,noOfMacthes,runs,noOfWickets);
		}
		
		for(int i=0;i<players.length;i++)
		{
		  System.out.println(players[i]);
		
		  System.out.println("Average: "+players[i].calculateAverage());
		
		}
	}

}
