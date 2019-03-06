/**
 * @author:RickeyJiang
 * @date:2019Äê3ÔÂ6ÈÕ
 */
package com.battlegame.bean.impl.monster;

import com.battlegame.bean.Monster;

public class Monster_GBL extends Monster{
	public Monster_GBL(double attack_power, double defend_power, double health_power, int experience) {
		super(attack_power, defend_power, health_power, experience);
		this.weak_type = "ap";
		//
	}
}
