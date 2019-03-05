/**
 * @author:RickeyJiang
 * @date:2019��3��6��
 */
package com.battlegame.bean.impl.attack;

import com.battlegame.bean.IAttackBehavior;
import com.battlegame.bean.Skill;

public class AttackLX_BDZ implements IAttackBehavior{
	//����+�ε�ն
	Skill skill = new Skill("�ƿհε�ն", (new AttackLX().getSkill().getSkill_attack_power() 
			+ new AttackBDZ().getSkill().getSkill_attack_power())*1.2);
	
	@Override
	public Skill getSkill() {
		return skill;
	}

	@Override
	public void attack() {
		System.out.println("�ƿհε�ն��");
	}
}
