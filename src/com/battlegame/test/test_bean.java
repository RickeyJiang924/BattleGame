package com.battlegame.test;

import org.junit.jupiter.api.Test;

import com.battlegame.bean.Role;
import com.battlegame.bean.Weapon;
import com.battlegame.bean.impl.monster.Monster_GBL;
import com.battlegame.bean.impl.role.Role_GQ;

class test_bean {

	@Test
	void test() throws Exception {
		//String name, double attack_power, double defend_power, double health_power, double magic_power,
		//int experience, String occupation, Weapon weapon, IAttackBehavior attackBehavior
		Role r = new Role_GQ("С��");
		System.out.println(r.getName()+":"+r.getOccupation()+","+"ӵ��������" + 
				r.getWeapon().getName() + "\n���ܣ�" + r.getWeapon().introduction());
		r.setMonster(new Monster_GBL(10, 0, 100, 10));
		Weapon w = r.getMonster().droppedWeapon();
		r.setWeapon(w);
		System.out.println("���������:" + r.getWeapon().getName() + "\n����:" + r.getWeapon().introduction());
		int i;
		for(i = 0 ; r.getWeapon().getLevel() < 15 ; i++) {
			System.out.print(r.getWeapon().strengthen() + ",�����ȼ�:" + r.getWeapon().getLevel());
			System.out.println(",����������:" + r.getWeapon().getAttack_power());
			//Thread.sleep(600);
		}
		System.out.println("ǿ��������"+i);
	}
	
}
