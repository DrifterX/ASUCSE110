// CSE 110     : 14867 / Online
// Assignment  : Assignment 07
// Author      : Nicholas Holmes 1223468454
// Description : Player class for Assignment 08


class Player {
	private String fullName;
	private double attackStat, blockStat;
	
	public Player(String name, double attack, double defense) {
		this.fullName = name;
		this.attackStat = attack;
		this.blockStat = defense;
	}
	public Player() {
		
	}
	
	public String getName() {
		return fullName;
	}
	public double getAttackStat() {
		return attackStat;
	}
	public double getBlockStat() {
		return blockStat;
	}
	
	public void setAttackStat(double attack) {
		this.attackStat = attack;
	}
	public void setBlockStat(double defense) {
		this.blockStat = defense;
	}
	
	public void printPlayerInfo() {
		System.out.print(fullName + " (attack = " + attackStat + ", block = " + blockStat + ")");
	}
	
}
