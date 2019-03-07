/**
 * @auhtor:RickeyJiang
 * @date:2019年3月8日
 */
package com.battlegame.bean.impl.monster;

import com.battlegame.bean.Monster;
import com.battlegame.bean.impl.weapon.Weapon_Monster_Greatsword;

public class Monster_CWLG extends Monster{
	public Monster_CWLG(double attack_power, double defend_power, double health_power, int experience) {
		super(attack_power, defend_power, health_power, experience);
		this.weak_type = "ad";
		this.weapon = new Weapon_Monster_Greatsword((int)Math.random()*10);
	}
	
	public String introduction() {
		return "虫王戮蛊:雌雄同体的巨虫，已在悲鸣洞窟里生存了数百年,超过数米的巨头上生长着尖锐的牙齿," 
				+ "弱点是惧怕物理伤害";
	}
}
