/**
 * @author:RickeyJiang
 * @date:2019��3��4��
 */
package com.battlegame.bean;

public class Skill {
	private String name;
	private double skill_attack_power;
	private int experience;
	private int level;
	
	public Skill() {
		
	}

	public Skill(String name, double skill_attack_power) {
		this.name = name;
		this.skill_attack_power = skill_attack_power;
		this.experience = 0;
		this.level = 1;
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
	
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	//ʹ�ü���,10*level����������һ����5�㼼�ܹ�����
	public void useSkill() {
		this.experience++;
		if(this.experience >= 10*level) {
			level++;
			this.skill_attack_power += 5 ;
			this.experience -= 10;
		}
	}
}
