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
		this.attack_power = 10;
		this.grow_power = 3.5;
	}
	
	@Override
	public String introduction() {
		return "�����������޵�ר�������������·����ɳ�ֵ�ϵͣ���ʼ���Խϸ�";
	}
}
