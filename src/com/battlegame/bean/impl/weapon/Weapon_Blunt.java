/**
 * @author:RickeyJiang
 * @date:2019年3月6日
 */
package com.battlegame.bean.impl.weapon;

import com.battlegame.bean.Weapon;

public class Weapon_Blunt extends Weapon{
	public Weapon_Blunt() {
		super();
		this.name = "钝器";
		this.basic_attack_power = 17;
		this.attack_power = this.basic_attack_power;
		this.grow_power = 3.5;
	}
	
	public Weapon_Blunt(int level) {
		this.level = level;
		this.name = "钝器";
		this.grow_power = 3.5;
		this.basic_attack_power = 17;
		this.attack_power = 17+level*this.grow_power;
	}
	
	@Override
	public String introduction() {
		return "钝器，阿修罗的专属武器，天神下凡，成长值较低，初始属性较高";
	}
}
