package com.neuedu.texttest;

public class ColeEmployee {
	private String name;
	private int month;
	public int getSalary(int month){
		if(this.month == month)
			return 100;
		else 
			return 0;
	}
	public String getName(){
		return name;
	}	
	public int getMonth(){
		return month;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setMonth(int month){
		this.month = month;
	}
	public ColeEmployee(){
	}
	public ColeEmployee(String name){
		this.name = name;
	}
}
