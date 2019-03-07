/**
 * @author:RickeyJiang
 * @date:2019��3��6��
 */
package com.battlegame.bean.impl.role;

import com.battlegame.bean.Role;
import com.battlegame.bean.impl.weapon.Weapon_Tachi;

public class Role_GQ extends Role{
	public Role_GQ(String name) {
		super(name);
		this.attack_power = 20;
		this.defend_power = 0;
		this.occupation = "����";
		this.type = "ap";
		this.weapon = new Weapon_Tachi();
	    //this.attackBehavior = new AttackLX();
	}
	
	public String introduction() {
		return "������ʴ�Լ����֣��������ʣ��������䰡��û��˭ϣ�����������鷢���ɣ�����˵����������ˡ��ڴ�֮ǰ��ֻ������ѡ�񣺷�ӡ���񡢽�����׸��ڰ���\r\n" + 
				"\r\n" + 
				"��������һ��ѡ�񣬶�Ҫ�����Լ�����־������а��Ĵ���֧���ǿ������Щ������Ҫ�ľ��ء� ";
	}
}
