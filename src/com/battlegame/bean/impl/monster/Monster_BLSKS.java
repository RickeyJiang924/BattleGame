/**
 * @auhtor:RickeyJiang
 * @date:2019年3月8日
 */
package com.battlegame.bean.impl.monster;

import com.battlegame.bean.Monster;
import com.battlegame.bean.impl.weapon.Weapon_Monster_Blunt;

public class Monster_BLSKS extends Monster{
	public Monster_BLSKS(double attack_power, double defend_power, double health_power, int experience) {
		super(attack_power, defend_power, health_power, experience);
		this.weak_type = "ap";
		this.weapon = new Weapon_Monster_Blunt((int)Math.random()*10);
	}
	
	public String introduction() {
		return "冰龙斯卡萨:忘记了何时入睡，更不知道何时醒来……斯卡萨带来的恐怖让所有人陷入窒息的绝望中，而这种绝望却遥遥无期，仿佛永远持续……"
				+ "弱点是惧怕魔法伤害";
	}
}