package com.neuedu.weekendtest;

public class ColaRmployee {
	private String name;
	private int month;
	public void getSalary(int month) {
		if(this.month == month)
			System.out.println("奖励100");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public ColaRmployee(String name) {
		super();
		this.name = name;
	}
	public ColaRmployee() {
		super();
	}
}
