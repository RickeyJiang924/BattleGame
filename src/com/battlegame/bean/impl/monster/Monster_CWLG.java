/**
 * @auhtor:RickeyJiang
 * @date:2019��3��8��
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
		return "����¾��:����ͬ��ľ޳棬���ڱ���������������������,�������׵ľ�ͷ�������ż��������," 
				+ "�����Ǿ��������˺�";
	}
}
