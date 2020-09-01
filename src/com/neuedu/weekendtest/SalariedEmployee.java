package com.neuedu.weekendtest;

public class SalariedEmployee extends ColaRmployee {
	private int monthQ;

	public int getMonthQ() {
		return monthQ;
	}

	public void setMonthQ(int monthQ) {
		this.monthQ = monthQ;
	}

	public SalariedEmployee(String name, int month, int monthQ) {
		super(name);
		if(month!=super.getMonth())
			this.monthQ = monthQ;
		else
			this.monthQ = monthQ+100;
	}

	public SalariedEmployee(String name, int month) {
		super(name);
	}
	
}
