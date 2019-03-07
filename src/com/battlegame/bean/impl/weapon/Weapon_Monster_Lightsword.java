/**
 * @auhtor:RickeyJiang
 * @date:2019��3��8��
 */
package com.battlegame.bean.impl.weapon;

import com.battlegame.bean.Weapon;

public class Weapon_Monster_Lightsword extends Weapon{
	public Weapon_Monster_Lightsword() {
		super();
		this.name = "�Ĺ��ų��⽣";
		this.basic_attack_power = 12;
		this.attack_power = this.basic_attack_power;
		this.grow_power = 6;
	}
	
	public Weapon_Monster_Lightsword(int level) {
		this.level = level;
		this.name = "�Ĺ��ų��⽣";
		this.grow_power = 6;
		this.basic_attack_power = 12;
		this.attack_power = 12+level*this.grow_power;
	}
	
	@Override
	public String introduction() {
		return "�Ĺ��ų��⽣��ʷʫ��������Ϊϡ��";
	}
}
