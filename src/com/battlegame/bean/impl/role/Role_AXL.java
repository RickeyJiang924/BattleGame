/**
 * @author:RickeyJiang
 * @date:2019��3��6��
 */
package com.battlegame.bean.impl.role;

import com.battlegame.bean.Role;
import com.battlegame.bean.impl.weapon.Weapon_Blunt;

public class Role_AXL extends Role{
	public Role_AXL(String name) {
		super(name);
		this.attack_power = 5;
		this.defend_power = 15;
		this.occupation = "������";
		this.weapon = new Weapon_Blunt();
	    //this.attackBehavior = new AttackLX();
	}
	
	public String introduction() {
		return "�ض��Ĳ��ҡ�\r\n" + 
				"\r\n" + "Ŀ�䲻�����Ȼ�ɸ�����ʵ���ͽ��Ŀ�������ޡ�\r\n" + 
				"\r\n" + "������â��������ֹ����������Ϊ���ѡ�  ";
	}
}
