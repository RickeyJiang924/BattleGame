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
		this.attack_power = 10;
		this.grow_power = 4.5;
	}
	
	@Override
	public String introduction() {
		return "̫����������ר����������ʱ�ͷų����߹�������޵���Ϣ���ɳ�ֵ�ϸߣ���ʼ���Խϵ�";
	}
}
