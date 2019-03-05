/**
 * @author:RickeyJiang
 * @date:2019��3��4��
 */
package com.battlegame.bean.impl.attack;

import com.battlegame.bean.IAttackBehavior;
import com.battlegame.bean.Skill;

public class AttackJDBH implements IAttackBehavior{
	private final Skill skill = new Skill("�����˻�", 100);
	
	@Override
	public Skill getSkill() {
		return this.skill;
	}

	@Override
	public void attack() {
		System.out.println("�����˻ģ�");
	}
}
