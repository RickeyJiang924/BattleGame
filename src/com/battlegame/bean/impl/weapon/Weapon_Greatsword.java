/**
 * @author:RickeyJiang
 * @date:2019��3��6��
 */
package com.battlegame.bean.impl.weapon;

import com.battlegame.bean.Weapon;

public class Weapon_Greatsword extends Weapon{
	public Weapon_Greatsword() {
		super();
		this.name = "�޽�";
		this.attack_power = 10;
		this.grow_power = 4;
	}
	
	@Override
	public String introduction() {
		return "�޽�����սʿ��ר������������ħ����ʹ�ã��ɳ�ֵ�ϵͣ���ʼ���Խϸ�";
	}
}
