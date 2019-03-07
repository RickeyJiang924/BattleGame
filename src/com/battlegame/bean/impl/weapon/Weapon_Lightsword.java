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
		this.basic_attack_power = 5;
		this.attack_power = this.basic_attack_power;
		this.grow_power = 5;
	}
	
	public Weapon_Lightsword(int level) {
		this.level = level;
		this.name = "�⽣";
		this.grow_power = 5;
		this.basic_attack_power = 5;
		this.attack_power = 5+level*this.grow_power;
	}
	
	@Override
	public String introduction() {
		return "�⽣�������ר��������������˸��ҫ�۵Ĺ�â���ɳ�ֵ���ߣ�����ʼ���Խϵ�";
	}
}
