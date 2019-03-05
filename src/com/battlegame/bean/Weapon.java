/**
 * @author:RickeyJiang
 * @date:2019Äê3ÔÂ4ÈÕ
 */
package com.battlegame.bean;

public abstract class Weapon {
	protected String name;
	protected double attack_power;
	protected double grow_power;
	protected int level;
	
	public Weapon() {
		this.level = 0;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAttack_power() {
		return attack_power;
	}
	public void setAttack_power(double attack_power) {
		this.attack_power = attack_power;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String introduction() {
		return "ÎäÆ÷½éÉÜ£º\n";
	}
}
