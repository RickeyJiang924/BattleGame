/**
 * @author:RickeyJiang
 * @date:2019年3月6日
 */
package com.battlegame.bean.impl.weapon;

import com.battlegame.bean.Weapon;

public class Weapon_Lightsword extends Weapon{

	public Weapon_Lightsword() {
		super();
		this.name = "光剑";
		this.attack_power = 10;
		this.grow_power = 5;
	}
	
	@Override
	public String introduction() {
		return "光剑，剑魂的专属武器，剑锋闪烁着耀眼的光芒，成长值极高，但初始属性较低";
	}
}
