/**
 * @author:RickeyJiang
 * @date:2019年3月6日
 */
package com.battlegame.bean.impl.weapon;

import com.battlegame.bean.Weapon;

public class Weapon_Greatsword extends Weapon{
	public Weapon_Greatsword() {
		super();
		this.name = "巨剑";
		this.attack_power = 13;
		this.grow_power = 4;
	}
	
	public Weapon_Greatsword(int level) {
		this.level = level;
		this.name = "巨剑";
		this.grow_power = 4;
		this.attack_power = 13+level*this.grow_power;
	}
	
	@Override
	public String introduction() {
		return "巨剑，狂战士的专属武器，不入魔不能使用，成长值较低，初始属性较高";
	}
}
