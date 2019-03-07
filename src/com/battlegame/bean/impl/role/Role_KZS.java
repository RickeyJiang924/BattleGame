/**
 * @author:RickeyJiang
 * @date:2019年3月6日
 */
package com.battlegame.bean.impl.role;

import com.battlegame.bean.Role;
import com.battlegame.bean.impl.weapon.Weapon_Greatsword;

public class Role_KZS extends Role{
	public Role_KZS(String name) {
		super(name);
		this.attack_power = 10;
		this.defend_power = 10;
		this.occupation = "狂战士";
		this.type = "ad";
		this.weapon = new Weapon_Greatsword();
	    //this.attackBehavior = new AttackLX();
	}
	
	public String introduction() {
		return "为了得到更强的力量，不惜一切代价！即使代价为出卖自己的灵魂！\n勇士们称呼他狱血魔神！";
	}
}
