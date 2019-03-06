/**
 * @author:RickeyJiang
 * @date:2019��3��6��
 */
package com.battlegame.bean.impl.weapon;

import com.battlegame.bean.Weapon;

public class Weapon_Monster_Tachi extends Weapon {
	public Weapon_Monster_Tachi() {
		super();
		this.name = "�Ĺ��ų�̫��";
		this.attack_power = 12;
		this.grow_power = 6;
	}
	
	public Weapon_Monster_Tachi(int level) {
		this.level = level;
		this.name = "̫��";
		this.grow_power = 6;
		this.attack_power = 12+level*this.grow_power;
	}
	
	@Override
	public String introduction() {
		return "�Ĺ��ų�̫����ʷʫ��������Ϊϡ��";
	}
}
