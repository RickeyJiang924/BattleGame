/**
 * @author:RickeyJiang
 * @date:2019Äê3ÔÂ6ÈÕ
 */
package com.battlegame.bean.impl.attack;

import com.battlegame.bean.IAttackBehavior;
import com.battlegame.bean.Skill;

public class AttackLX_BDZ implements IAttackBehavior{
	//Á÷ÐÄ+°Îµ¶Õ¶
	Skill skill = new Skill("ÆÆ¿Õ°Îµ¶Õ¶", (new AttackLX().getSkill().getSkill_attack_power() 
			+ new AttackBDZ().getSkill().getSkill_attack_power())*1.2);
	
	@Override
	public Skill getSkill() {
		return skill;
	}

	@Override
	public void attack() {
		System.out.println("ÆÆ¿Õ°Îµ¶Õ¶£¡");
	}
}
