// CSE 110     : 14867 / Online
// Assignment  : Assignment 07
// Author      : Nicholas Holmes 1223468454
// Description : Weapon class for Assignment 07

class Weapon {
	//instanced variables
	private String name;
	private int maxDamage;
	
	//constructors
	public Weapon() {
		this.name = "Pointy Stick";
		this.maxDamage = 1;
	}
	public Weapon(String weaponName, int highestDamage) {
		this.name = weaponName;
		this.maxDamage = highestDamage;
	}
	
	//getters
	public String getName() {
		return name;
	}
	public int getMaxDamage() {
		return maxDamage;
	}
	
	//setters
	public void setName(String name) {
		this.name = name;
	}
	public void setMaxDamage(int maxDamage) {
		this.maxDamage = maxDamage;
	}
	
	
}
