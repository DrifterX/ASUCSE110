// CSE 110     : 14867 / Online
// Assignment  : Assignment 07
// Author      : Nicholas Holmes 1223468454
// Description : Monster class for Assignment 07

class Monster {

	//instance variables
	private String name;
	private int healthScore;
	private Weapon hittingThing = new Weapon();
	
	//constructors
	public Monster() {
		
	}
	public Monster(String name, int healthScore, Weapon thingToHitWith) {
		this.name = name;
		this.healthScore = healthScore;
		this.hittingThing = thingToHitWith;
	}
	
	//getters
	public String getName() {
		return name;
	}
	public int getHealthScore() {
		return healthScore;
	}
	public String getWeaponName() {
		return hittingThing.getName();
	}
	
	//setters
	public void setName(String name) {
		this.name = name;
	}
	public void setHealthScore(int newHealthScore) {
		this.healthScore = newHealthScore;
	}
	public void setWeaponName(Weapon newWeapon) {
		this.hittingThing = newWeapon;
	}
	
	
	//Method used for attacking
	public int attack(Monster enemy) {
		final int MAX_DAMAGE = hittingThing.getMaxDamage();
		int damageDealt, enemyCurrentHP;
				
		damageDealt = (int)(Math.random() * MAX_DAMAGE);
		enemyCurrentHP = enemy.getHealthScore() - damageDealt;
		enemy.setHealthScore(enemyCurrentHP);
		
		return damageDealt;
	}
	
}
