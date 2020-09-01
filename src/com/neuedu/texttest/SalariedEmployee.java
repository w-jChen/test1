package com.neuedu.texttest;

public class SalariedEmployee extends ColeEmployee {
	private int monthlyPay;
	public void setMonthlyPay(int monthlyPay){
		this.monthlyPay = monthlyPay;
	}
	public int getMonthlyPay(){
		return monthlyPay;
	}
	public SalariedEmployee(){}
	public SalariedEmployee(int monthlyPay,String name){
		super(name);
		this.monthlyPay = monthlyPay;
	}
}
