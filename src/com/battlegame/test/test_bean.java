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
		Role r = new Role_GQ("小付");
		System.out.println(r.getName()+":"+r.getOccupation()+","+"拥有武器：" + 
				r.getWeapon().getName() + "\n介绍：" + r.getWeapon().introduction());
		r.setMonster(new Monster_GBL(10, 0, 100, 10));
		Weapon w = r.getMonster().droppedWeapon();
		r.setWeapon(w);
		System.out.println("获得新武器:" + r.getWeapon().getName() + "\n介绍:" + r.getWeapon().introduction());
		int i;
		for(i = 0 ; r.getWeapon().getLevel() < 15 ; i++) {
			System.out.print(r.getWeapon().strengthen() + ",武器等级:" + r.getWeapon().getLevel());
			System.out.println(",武器攻击力:" + r.getWeapon().getAttack_power());
			//Thread.sleep(600);
		}
		System.out.println("强化次数："+i);
	}
	
}
