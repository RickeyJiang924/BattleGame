/**
 * @auhtor:RickeyJiang
 * @date:2019年3月8日
 */
package com.battlegame.bean.impl.monster;

import com.battlegame.bean.Monster;
import com.battlegame.bean.impl.weapon.Weapon_Monster_Lightsword;

public class Monster_GZCZ extends Monster{
	public Monster_GZCZ(double attack_power, double defend_power, double health_power, int experience) {
		super(attack_power, defend_power, health_power, experience);
		this.weak_type = "ad";
		this.weapon = new Weapon_Monster_Lightsword((int)Math.random()*10);
	}
	
	public String introduction() {
		return "光之城主赛格哈特：你对我的忠诚，我已经感觉到了,我死后，你就不必再坚守这座城了和我一同安息吧，我忠实的部下," 
				+ "弱点是惧怕物理伤害";
	}
}