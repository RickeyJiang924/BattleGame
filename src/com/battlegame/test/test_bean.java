package com.battlegame.test;

import org.junit.jupiter.api.Test;

import com.battlegame.bean.Role;
import com.battlegame.bean.impl.role.Role_GQ;

class test_bean {

	@Test
	void test() {
		//String name, double attack_power, double defend_power, double health_power, double magic_power,
		//int experience, String occupation, Weapon weapon, IAttackBehavior attackBehavior
		Role r = new Role_GQ("��ѧ��");
		System.out.println(r.getName()+":"+r.getOccupation()+"��"+"���������"+r.getWeapon().getName());
//		for(int i = 0 ; i <= 100 ; i++) {
//			System.out.print(r.getWeapon().strengthen()+"�������ȼ���");
//			System.out.println(r.getWeapon().getLevel());
//		}
		
	}
	
}
