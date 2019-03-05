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
		this.attack_power = 10;
		this.grow_power = 4;
	}
	
	@Override
	public String introduction() {
		return "巨剑，狂战士的专属武器，不入魔不能使用，成长值较低，初始属性较高";
	}
}
