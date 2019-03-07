/**
 * @auhtor:RickeyJiang
 * @date:2019��3��8��
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
		return "��֮����������أ�����ҵ��ҳϣ����Ѿ��о�����,��������Ͳ����ټ����������˺���һͬ��Ϣ�ɣ�����ʵ�Ĳ���," 
				+ "�����Ǿ��������˺�";
	}
}