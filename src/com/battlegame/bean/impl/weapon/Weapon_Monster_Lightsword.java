/**
 * @auhtor:RickeyJiang
 * @date:2019年3月8日
 */
package com.battlegame.bean.impl.weapon;

import com.battlegame.bean.Weapon;

public class Weapon_Monster_Lightsword extends Weapon{
	public Weapon_Monster_Lightsword() {
		super();
		this.name = "荒古遗尘光剑";
		this.basic_attack_power = 12;
		this.attack_power = this.basic_attack_power;
		this.grow_power = 6;
	}
	
	public Weapon_Monster_Lightsword(int level) {
		this.level = level;
		this.name = "荒古遗尘光剑";
		this.grow_power = 6;
		this.basic_attack_power = 12;
		this.attack_power = 12+level*this.grow_power;
	}
	
	@Override
	public String introduction() {
		return "荒古遗尘光剑，史诗武器，较为稀有";
	}
}
