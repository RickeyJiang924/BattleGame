/**
 * @author:RickeyJiang
 * @date:2019��3��6��
 */
package com.battlegame.bean.impl.weapon;

import com.battlegame.bean.Weapon;

public class Weapon_Lightsword extends Weapon{

	public Weapon_Lightsword() {
		super();
		this.name = "�⽣";
		this.attack_power = 10;
		this.grow_power = 5;
	}
	
	@Override
	public String introduction() {
		return "�⽣�������ר��������������˸��ҫ�۵Ĺ�â���ɳ�ֵ���ߣ�����ʼ���Խϵ�";
	}
}
