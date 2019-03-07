/**
 * @author:RickeyJiang
 * @date:2019��3��6��
 */
package com.battlegame.bean.impl.role;

import com.battlegame.bean.Role;
import com.battlegame.bean.impl.weapon.Weapon_Lightsword;

public class Role_JH extends Role{

	public Role_JH(String name) {
		super(name);
		this.attack_power = 15;
		this.defend_power = 5;
		this.occupation = "����";
		this.type = "ad";
		this.weapon = new Weapon_Lightsword();
	    //this.attackBehavior = new AttackLX();
	}
	
	public String introduction() {
		return "�����ľ���᲻��������ֹ���ģ�\n "
				+ "�������Լ���û�о�������������ƿ�����ѱ���˦�������ˡ��Ǻǣ������Ҳ����������������ˣ���Ϊ�������Ѿ��ػ���������Ϊ��һλ������ʵ�Ľ�ʥ�� ";
	}
}
