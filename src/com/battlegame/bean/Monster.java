/**
 * @author:RickeyJiang
 * @date:2019Äê3ÔÂ4ÈÕ
 */
package com.battlegame.bean;

public abstract class Monster {
	private double attack_power;
	private double defend_power;
	private double health_power;
	private int experience;
	
	public Monster(double attack_power, double defend_power, double health_power, int experience) {
		super();
		this.attack_power = attack_power;
		this.defend_power = defend_power;
		this.health_power = health_power;
		this.experience = experience;
	}

	public double getAttack_power() {
		return attack_power;
	}

	public void setAttack_power(double attack_power) {
		this.attack_power = attack_power;
	}

	public double getDefend_power() {
		return defend_power;
	}

	public void setDefend_power(double defend_power) {
		this.defend_power = defend_power;
	}

	public double getHealth_power() {
		return health_power;
	}

	public void setHealth_power(double health_power) {
		this.health_power = health_power;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}
}
