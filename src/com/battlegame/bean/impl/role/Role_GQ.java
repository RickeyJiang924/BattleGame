/**
 * @author:RickeyJiang
 * @date:2019年3月6日
 */
package com.battlegame.bean.impl.role;

import com.battlegame.bean.Role;
import com.battlegame.bean.impl.weapon.Weapon_Tachi;

public class Role_GQ extends Role{
	public Role_GQ(String name) {
		super(name);
		this.attack_power = 20;
		this.defend_power = 0;
		this.occupation = "鬼泣";
		this.type = "ap";
		this.weapon = new Weapon_Tachi();
	    //this.attackBehavior = new AttackLX();
	}
	
	public String introduction() {
		return "鬼神侵蚀自己左手，毫无疑问，这是诅咒啊。没有谁希望这样的事情发生吧，可以说，这就是命运。在此之前，只有两个选择：封印鬼神、将灵魂献给黑暗。\r\n" + 
				"\r\n" + 
				"无论是哪一个选择，都要赌上自己的意志，不被邪恶的存在支配的强大精神，这些力量必要的境地。 ";
	}
}
