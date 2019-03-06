package com.battlegame.test;

import org.junit.jupiter.api.Test;

import com.battlegame.bean.Role;
import com.battlegame.bean.impl.role.Role_GQ;

class test_bean {

	@Test
	void test() {
		//String name, double attack_power, double defend_power, double health_power, double magic_power,
		//int experience, String occupation, Weapon weapon, IAttackBehavior attackBehavior
		Role r = new Role_GQ("蒋学垲");
		System.out.println(r.getName()+":"+r.getOccupation()+"，"+"获得武器："+r.getWeapon().getName());
//		for(int i = 0 ; i <= 100 ; i++) {
//			System.out.print(r.getWeapon().strengthen()+"，武器等级：");
//			System.out.println(r.getWeapon().getLevel());
//		}
		
	}
	
}
