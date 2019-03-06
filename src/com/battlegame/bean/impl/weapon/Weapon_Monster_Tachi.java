/**
 * @author:RickeyJiang
 * @date:2019Äê3ÔÂ6ÈÕ
 */
package com.battlegame.bean.impl.weapon;

import com.battlegame.bean.Weapon;

public class Weapon_Monster_Tachi extends Weapon {
	public Weapon_Monster_Tachi() {
		super();
		this.name = "»Ä¹ÅÒÅ³¾Ì«µ¶";
		this.attack_power = 12;
		this.grow_power = 6;
	}
	
	public Weapon_Monster_Tachi(int level) {
		this.level = level;
		this.name = "Ì«µ¶";
		this.grow_power = 6;
		this.attack_power = 12+level*this.grow_power;
	}
	
	@Override
	public String introduction() {
		return "»Ä¹ÅÒÅ³¾Ì«µ¶£¬Ê·Ê«ÎäÆ÷£¬½ÏÎªÏ¡ÓĞ";
	}
}
