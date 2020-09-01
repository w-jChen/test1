package com.neuedu.texttest;

public class Conpany{
	public void cout(int monthPay,String zl,int month,String name){
		if(zl.equals("月薪")){
			SalariedEmployee sal = new SalariedEmployee(monthPay,name);
			sal.setMonth(10);
			int a = sal.getMonthlyPay() + sal.getSalary(month);
			System.out.println(name+":"+a);
		}
	}
}
