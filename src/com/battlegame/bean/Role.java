/**
 * @author:RickeyJiang
 * @date:2019年3月4日
 */
package com.battlegame.bean;

import java.util.ArrayList;

import com.battlegame.bean.IAttackBehavior;

public abstract class Role {
	protected String name;
	protected double attack_power;
	protected double defend_power;
	protected double health_power;
	protected double magic_power;
	protected int experience;
	protected String occupation;
	protected Weapon weapon;
	protected ArrayList<Skill> skill;
    protected IAttackBehavior attackBehavior;

	public Role(String name) {
		this.name = name;
		this.health_power = 100;
		this.magic_power = 100;
		this.experience = 0;
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

	public double getMagic_power() {
		return magic_power;
	}

	public void setMagic_power(double magic_power) {
		this.magic_power = magic_power;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public ArrayList<Skill> getSkill() {
		return skill;
	}

	public void setSkill(ArrayList<Skill> skill) {
		this.skill = skill;
	}
	
	public void addSkill(Skill skill) {
		this.skill.add(skill);
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public IAttackBehavior getAttackBehavior() {
		return attackBehavior;
	}

	public void setAttackBehavior(IAttackBehavior attackBehavior) {
		this.attackBehavior = attackBehavior;
	}
	
	//计算总攻击力
	public double calculate() {
		return 0;
	}
}
