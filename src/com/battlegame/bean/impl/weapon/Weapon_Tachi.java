/**
 * @author:RickeyJiang
 * @date:2019年3月6日
 */
package com.battlegame.bean.impl.weapon;

import com.battlegame.bean.Weapon;

public class Weapon_Tachi extends Weapon{
	public Weapon_Tachi() {
		super();
		this.name = "太刀";
		this.basic_attack_power = 9;
		this.attack_power = this.basic_attack_power;
		this.grow_power = 4.5;
	}
	
	public Weapon_Tachi(int level) {
		this.level = level;
		this.name = "太刀";
		this.grow_power = 4.5;
		this.basic_attack_power = 9;
		this.attack_power = 9+level*this.grow_power;
	}
	
	@Override
	public String introduction() {
		return "太刀，鬼泣的专属武器，不时释放出第七鬼神怖拉修的气息，成长值较高，初始属性较低";
	}
}
