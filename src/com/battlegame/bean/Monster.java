/**
 * @author:RickeyJiang
 * @date:2019��3��4��
 */
package com.battlegame.bean;

public abstract class Monster {
	protected double attack_power;
	protected double defend_power;
	protected double health_power;
	protected String weak_type;
	protected int experience;
	protected Weapon weapon;
	
	public Monster(double attack_power, double defend_power, double health_power, int experience) {
		this.attack_power = attack_power;
		this.defend_power = defend_power;
		this.health_power = health_power;
		this.experience = experience;
		//�����ʼ���������������ͣ�ħ��/����
		//this.weapon = new Weapon();
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

	//�ж�HP����0�����ɵ���droppedWeapon()��droppedArmor()��ȡװ��
	public void setHealth_power(double health_power) {
		this.health_power = health_power;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getWeak_type() {
		return weak_type;
	}

	public void setWeak_type(String weak_type) {
		this.weak_type = weak_type;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	//�����и��ʵ�������
	public Weapon droppedWeapon() {
		double d = Math.random();
		if(d <= (1000-this.experience)/1000) {
			return this.weapon;
		}
		return null;
	}
	
	//�����и��ʵ������
	public void droppedArmor() {
		//�����������...
	}
}
