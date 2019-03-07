/**
 * @author:RickeyJiang
 * @date:2019��3��4��
 */
package com.battlegame.bean;

public abstract class Weapon {
	protected String name;
	protected double basic_attack_power;
	protected double attack_power;
	protected double grow_power;
	protected int level;

	public Weapon() {
		this.level = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBasic_attack_power() {
		return basic_attack_power;
	}

	public void setBasic_attack_power(double basic_attack_power) {
		this.basic_attack_power = basic_attack_power;
	}

	public double getAttack_power() {
		return attack_power;
	}

	public void setAttack_power(double attack_power) {
		this.attack_power = attack_power;
	}

	public int getLevel() {
		return level;
	}

	//��Ұ��װ�����������ȼ�
	public void setLevel(int level) {
		double[] d = new double[100];
		d[0] = basic_attack_power;
		for(int i = 1 ; i < 100 ; i++) {
			d[i] = i > 10 ? d[i-1]+(i-10)*grow_power : d[i-1]+grow_power;
		}
		this.attack_power = d[level];
		this.level = level;
	}

	public String introduction() {
		return "�������ܣ�\n";
	}

	//ǿ�����ʸ��ݵȼ��仯
	public String strengthen() {
		double d = Math.random();
		if(level <= 4) {
			this.setLevel(level+1);
			return "ǿ���ɹ�";
		}else if(level <= 6) {
			if(d <= 0.8) {
				this.setLevel(level+1);
				return "ǿ���ɹ�";
			}else {
				return "ǿ��ʧ��";
			}
		}else if(level <= 8) {
			if(d <= 0.6) {
				this.setLevel(level+1);
				return "ǿ���ɹ�";
			}else {
				return "ǿ��ʧ��";
			}
		}else if(level <= 10) {
			if(d <= 0.4) {
				this.setLevel(level+1);
				return "ǿ���ɹ�";
			}else {
				return "ǿ��ʧ��";
			}
		}else if(level <= 11){
			if(d <= 0.3) {
				this.setLevel(level+1);
				return "ǿ���ɹ�";
			}else {
				this.setLevel(7);
				return "ǿ��ʧ��";
			}
		}else if(level <= 12){
			if(d <= 0.2) {
				this.setLevel(level+1);
				return "ǿ���ɹ�";
			}else {
				this.setLevel(8);
				return "ǿ��ʧ��";
			}
		}else if(level <= 13){
			if(d <= 0.1667) {
				this.setLevel(level+1);
				return "ǿ���ɹ�";
			}else {
				this.setLevel(0);
				return "ǿ��ʧ��";
			}
		}else if(level <= 14){
			if(d <= 0.1429) {
				this.setLevel(level+1);
				return "ǿ���ɹ�";
			}else {
				this.setLevel(0);
				return "ǿ��ʧ��";
			}
		}else {
			if(d <= 0.125) {
				this.setLevel(level+1);
				return "ǿ���ɹ�";
			}else {
				this.setLevel(0);
				return "ǿ��ʧ��";
			}
		}
	}
}
