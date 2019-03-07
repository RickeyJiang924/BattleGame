/**
 * @auhtor:RickeyJiang
 * @date:2019��3��8��
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
		return "����˹����:�����˺�ʱ��˯������֪����ʱ��������˹���������Ŀֲ���������������Ϣ�ľ����У������־���ȴңң���ڣ��·���Զ��������"
				+ "�����Ǿ���ħ���˺�";
	}
}