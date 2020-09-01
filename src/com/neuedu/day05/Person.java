package com.neuedu.day05;

public class Person {
	private String pName;
	public String getpName() {
		return pName;
	}


	public void setpName(String pName) {
		this.pName = pName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	private int age;
	private String sex;
	
	
	public void sayHello() {
		System.out.println("hello");
	}
}
