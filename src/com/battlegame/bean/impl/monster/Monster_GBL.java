/**
 * @author:RickeyJiang
 * @date:2019年3月6日
 */
package com.battlegame.bean.impl.monster;

import com.battlegame.bean.Monster;
import com.battlegame.bean.impl.weapon.Weapon_Monster_Tachi;

public class Monster_GBL extends Monster{
	public Monster_GBL(double attack_power, double defend_power, double health_power, int experience) {
		super(attack_power, defend_power, health_power, experience);
		this.weak_type = "ap";
		this.weapon = new Weapon_Monster_Tachi((int)Math.random()*10);
	}
	
	public String introduction() {
		return "哥布林:作为被蹂躏到不能起身的怪物，能在异界翻身做主人吗？"
				+ "弱点是惧怕魔法伤害";
	}
}
