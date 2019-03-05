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
		this.attack_power = 10;
		this.grow_power = 3.5;
	}
	
	@Override
	public String introduction() {
		return "钝器，阿修罗的专属武器，天神下凡，成长值较低，初始属性较高";
	}
}
