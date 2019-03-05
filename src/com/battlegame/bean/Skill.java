/**
 * @author:RickeyJiang
 * @date:2019Äê3ÔÂ4ÈÕ
 */
package com.battlegame.bean;

public class Skill {
	private String name;
	private double skill_attack_power;
	private int experience;
	
	public Skill() {
		
	}

	public Skill(String name, double skill_attack_power) {
		this.name = name;
		this.skill_attack_power = skill_attack_power;
		this.experience = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSkill_attack_power() {
		return skill_attack_power;
	}

	public void setSkill_attack_power(double skill_attack_power) {
		this.skill_attack_power = skill_attack_power;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}
	
}
