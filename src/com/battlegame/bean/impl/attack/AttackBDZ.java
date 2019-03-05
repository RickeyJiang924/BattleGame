/**
 * @author:RickeyJiang
 * @date:2019��3��6��
 */
package com.battlegame.bean.impl.attack;

import com.battlegame.bean.IAttackBehavior;
import com.battlegame.bean.Skill;

public class AttackBDZ implements IAttackBehavior{
	private final Skill skill = new Skill("�ε�ն", 100);
	
	@Override
	public Skill getSkill() {
		return skill;
	}

	@Override
	public void attack() {
		System.out.println("�ε�ն��");
	}
}
