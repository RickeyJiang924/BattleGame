/**
 * @auhtor:RickeyJiang
 * @date:2019Äê3ÔÂ8ÈÕ
 */
package com.battlegame.bean.impl.weapon;

import com.battlegame.bean.Weapon;

public class Weapon_Monster_Blunt extends Weapon{
	public Weapon_Monster_Blunt() {
		super();
		this.name = "»Ä¹ÅÒÅ³¾¶ÛÆ÷";
		this.basic_attack_power = 12;
		this.attack_power = this.basic_attack_power;
		this.grow_power = 6;
	}
	
	public Weapon_Monster_Blunt(int level) {
		this.level = level;
		this.name = "»Ä¹ÅÒÅ³¾¶ÛÆ÷";
		this.grow_power = 6;
		this.basic_attack_power = 12;
		this.attack_power = 12+level*this.grow_power;
	}
	
	@Override
	public String introduction() {
		return "»Ä¹ÅÒÅ³¾¶ÛÆ÷£¬Ê·Ê«ÎäÆ÷£¬½ÏÎªÏ¡ÓĞ";
	}
}
