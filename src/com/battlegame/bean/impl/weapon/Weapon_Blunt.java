/**
 * @author:RickeyJiang
 * @date:2019��3��6��
 */
package com.battlegame.bean.impl.weapon;

import com.battlegame.bean.Weapon;

public class Weapon_Blunt extends Weapon{
	public Weapon_Blunt() {
		super();
		this.name = "����";
		this.attack_power = 17;
		this.grow_power = 3.5;
	}
	
	public Weapon_Blunt(int level) {
		this.level = level;
		this.name = "����";
		this.grow_power = 3.5;
		this.attack_power = 17+level*this.grow_power;
	}
	
	@Override
	public String introduction() {
		return "�����������޵�ר�������������·����ɳ�ֵ�ϵͣ���ʼ���Խϸ�";
	}
}
