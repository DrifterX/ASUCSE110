// CSE 110     : 14867 / Online
// Assignment  : Assignment 07
// Author      : Nicholas Holmes 1223468454
// Description : Roster class for Assignment 08

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class Roster {
	private ArrayList<Player> players;
	
	public Roster() {
		this.players = new ArrayList<Player>();
	}
	
	public Roster(String fileName) throws FileNotFoundException {
		this.players = new ArrayList<Player>();
		File inputFile = new File(fileName);
		Scanner fileReader = new Scanner(inputFile);
		while(fileReader.hasNextLine()) {
			String currentLine = fileReader.nextLine();
			String[] currentLineArray = currentLine.split(" ");
			String currentName = currentLineArray[0] + " " + currentLineArray[1];
			double currentAttack = Double.parseDouble(currentLineArray[2]);
			double currentDefense = Double.parseDouble(currentLineArray[3]);
			Player currentPlayer = new Player(currentName, currentAttack, currentDefense);
			players.add(currentPlayer);
		}
		fileReader.close();
	}

	
	public void printTopAttackers() {
		Player topPlayer = players.get(0); 
		Player secondPlayer = players.get(0);
		double topStat = -1;
		double secondStat = -1;
		int indexOfTopPlayer = 0;
		for(int i = 0; i < players.size(); i++) {
			if(players.get(i).getAttackStat() >= topStat) {
				topPlayer = players.get(i);
				topStat = players.get(i).getAttackStat();
				indexOfTopPlayer = i;
			}
		}
		for(int i = 0; i < players.size(); i++) {
			if(i == indexOfTopPlayer)
				continue;
			if(players.get(i).getAttackStat() >= secondStat) {
				secondPlayer = players.get(i);
				secondStat = players.get(i).getAttackStat();
			}
		}
		System.out.println();
		topPlayer.printPlayerInfo();
		System.out.println();
		secondPlayer.printPlayerInfo();
		System.out.println("\n");
	}
	
	public void printTopBlockers() {
		Player topPlayer = players.get(0); 
		Player secondPlayer = players.get(0);
		double topStat = -1;
		double secondStat = -1;
		double indexOfTopPlayer = 0;
		for(int i = 0; i < players.size(); i++) {
			if(players.get(i).getBlockStat() >= topStat) {
				topPlayer = players.get(i);
				topStat = players.get(i).getBlockStat();
				indexOfTopPlayer = i;
			}
		}
		for(int i = 0; i < players.size(); i++) {
			if(i == indexOfTopPlayer)
				continue;
			if(players.get(i).getBlockStat() >= secondStat) {
				secondPlayer = players.get(i);
				secondStat = players.get(i).getBlockStat();
			}
				
		}
		System.out.println();
		topPlayer.printPlayerInfo();
		System.out.println();
		secondPlayer.printPlayerInfo();
		System.out.println("\n");
	}
	
	public void printAllPlayers() {
		System.out.println();
		for(Player player : players) {
			player.printPlayerInfo();
			System.out.println();
		}
		System.out.println();
	}
	
	public int countPlayers() {
		return players.size();
	}
	public void addPlayer(String name, double attackStat, double blockStat) {
		Player newPlayer = new Player(name, attackStat, blockStat);
		players.add(newPlayer);		
	}
	public Player getPlayerByName(String playerName) {
		for(int i = 0; i < players.size(); i++) {
			if(players.get(i).getName().equals(playerName)) {
				return players.get(i);
			}
		}
		return null;
	}
}
