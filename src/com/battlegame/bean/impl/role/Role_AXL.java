/**
 * @author:RickeyJiang
 * @date:2019年3月6日
 */
package com.battlegame.bean.impl.role;

import com.battlegame.bean.Role;
import com.battlegame.bean.impl.weapon.Weapon_Blunt;

public class Role_AXL extends Role{
	public Role_AXL(String name) {
		super(name);
		this.attack_power = 5;
		this.defend_power = 15;
		this.occupation = "阿修罗";
		this.weapon = new Weapon_Blunt();
	    //this.attackBehavior = new AttackLX();
	}
	
	public String introduction() {
		return "地动心不乱。\r\n" + 
				"\r\n" + "目虽不可视物，然可感万物。故得悟徒以目视物者愚。\r\n" + 
				"\r\n" + "舍弃光芒，修炼不止，暗黑亦终为吾友。  ";
	}
}
