/**
 * @author:RickeyJiang
 * @date:2019��3��6��
 */
package com.battlegame.bean.impl.role;

import com.battlegame.bean.Role;
import com.battlegame.bean.impl.weapon.Weapon_Greatsword;

public class Role_KZS extends Role{
	public Role_KZS(String name) {
		super(name);
		this.attack_power = 10;
		this.defend_power = 10;
		this.occupation = "��սʿ";
		this.type = "ad";
		this.weapon = new Weapon_Greatsword();
	    //this.attackBehavior = new AttackLX();
	}
	
	public String introduction() {
		return "Ϊ�˵õ���ǿ����������ϧһ�д��ۣ���ʹ����Ϊ�����Լ�����꣡\n��ʿ�ǳƺ�����Ѫħ��";
	}
}
