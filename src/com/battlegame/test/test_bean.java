package com.battlegame.test;

import org.junit.jupiter.api.Test;

import com.battlegame.bean.Role;
import com.battlegame.bean.impl.role.Role_JH;

class test_bean {

	@Test
	void test() {
		//String name, double attack_power, double defend_power, double health_power, double magic_power,
		//int experience, String occupation, Weapon weapon, IAttackBehavior attackBehavior
		Role r = new Role_JH("jxk");
		System.out.println(r.getName()+":"+r.getOccupation()+" "+"已修得技能："+r.getAttackBehavior().getSkill().getName()+
				"技能攻击力："+r.getAttackBehavior().getSkill().getSkill_attack_power());
	}
}
