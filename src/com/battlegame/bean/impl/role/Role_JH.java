/**
 * @author:RickeyJiang
 * @date:2019年3月6日
 */
package com.battlegame.bean.impl.role;

import com.battlegame.bean.Role;
import com.battlegame.bean.impl.attack.AttackLX;
import com.battlegame.bean.impl.weapon.Weapon_Lightsword;

public class Role_JH extends Role{

	public Role_JH(String name) {
		super(name);
		this.attack_power = 10;
		this.defend_power = 10;
		this.occupation = "剑魂";
		this.weapon = new Weapon_Lightsword();
	    this.attackBehavior = new AttackLX();
	}
	
	public String introduction() {
		return "剑术的境界会不会是永无止境的？\n "
				+ "……你自己还没感觉到吗？你遭遇的瓶颈早已被你甩到背后了。呵呵，看来我不能再随便对您无礼了，因为……您已经重获新生，成为了一位名副其实的剑圣。 ";
	}
}
