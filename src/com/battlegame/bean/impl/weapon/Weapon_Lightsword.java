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
		this.basic_attack_power = 5;
		this.attack_power = this.basic_attack_power;
		this.grow_power = 5;
	}
	
	public Weapon_Lightsword(int level) {
		this.level = level;
		this.name = "光剑";
		this.grow_power = 5;
		this.basic_attack_power = 5;
		this.attack_power = 5+level*this.grow_power;
	}
	
	@Override
	public String introduction() {
		return "光剑，剑魂的专属武器，剑锋闪烁着耀眼的光芒，成长值极高，但初始属性较低";
	}
}
