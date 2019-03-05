/**
 * @author:RickeyJiang
 * @date:2019Äê3ÔÂ4ÈÕ
 */
package com.battlegame.bean.impl.attack;

import com.battlegame.bean.IAttackBehavior;
import com.battlegame.bean.Skill;

public class AttackJDBH implements IAttackBehavior{
	private final Skill skill = new Skill("½£µ´°Ë»Ä", 100);
	
	@Override
	public Skill getSkill() {
		return this.skill;
	}

	@Override
	public void attack() {
		System.out.println("½£µ´°Ë»Ä£¡");
	}
}
