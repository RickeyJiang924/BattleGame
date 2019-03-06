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
		this.attack_power = 13;
		this.grow_power = 4;
	}
	
	public Weapon_Greatsword(int level) {
		this.level = level;
		this.name = "�޽�";
		this.grow_power = 4;
		this.attack_power = 13+level*this.grow_power;
	}
	
	@Override
	public String introduction() {
		return "�޽�����սʿ��ר������������ħ����ʹ�ã��ɳ�ֵ�ϵͣ���ʼ���Խϸ�";
	}
}
