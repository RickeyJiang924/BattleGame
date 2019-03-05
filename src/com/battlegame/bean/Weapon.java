/**
 * @author:RickeyJiang
 * @date:2019年3月4日
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
		return "武器介绍：\n";
	}

	public String strengthen() {
		double d = Math.random();
		if(level <= 4) {
			level++;
			attack_power += grow_power;
			return "强化成功";
		}else if(level <= 6) {
			if(d <= 0.8) {
				level++;
				attack_power += grow_power;
				return "强化成功";
			}else {
				return "强化失败";
			}
		}else if(level <= 8) {
			if(d <= 0.6) {
				level++;
				attack_power += grow_power;
				return "强化成功";
			}else {
				return "强化失败";
			}
		}else if(level <= 10) {
			if(d <= 0.4) {
				level++;
				attack_power += grow_power;
				return "强化成功";
			}else {
				return "强化失败";
			}
		}else if(level <= 11){
			if(d <= 0.3) {
				level++;
				attack_power += 2*grow_power;
				return "强化成功";
			}else {
				level = 7;
				return "强化失败";
			}
		}else if(level <= 12){
			if(d <= 0.2) {
				level++;
				attack_power += 2*grow_power;
				return "强化成功";
			}else {
				level = 8;
				return "强化失败";
			}
		}else if(level <= 13){
			if(d <= 0.1) {
				level++;
				attack_power += 3*grow_power;
				return "强化成功";
			}else {
				level = 10;
				return "强化失败";
			}
		}else if(level <= 14){
			if(d <= 0.05) {
				level++;
				attack_power += 4*grow_power;
				return "强化成功";
			}else {
				level = 10;
				return "强化失败";
			}
		}else {
			if(d <= 0.03) {
				level++;
				attack_power += 5*grow_power;
				return "强化成功";
			}else {
				level = 10;
				return "强化失败";
			}
		}
	}
}
