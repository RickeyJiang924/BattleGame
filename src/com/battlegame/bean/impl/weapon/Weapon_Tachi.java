/**
 * @author:RickeyJiang
 * @date:2019��3��6��
 */
package com.battlegame.bean.impl.weapon;

import com.battlegame.bean.Weapon;

public class Weapon_Tachi extends Weapon{
	public Weapon_Tachi() {
		super();
		this.name = "̫��";
		this.attack_power = 9;
		this.grow_power = 4.5;
	}
	
	public Weapon_Tachi(int level) {
		this.level = level;
		this.name = "̫��";
		this.grow_power = 4.5;
		this.attack_power = 9+level*this.grow_power;
	}
	
	@Override
	public String introduction() {
		return "̫����������ר����������ʱ�ͷų����߹�������޵���Ϣ���ɳ�ֵ�ϸߣ���ʼ���Խϵ�";
	}
}
