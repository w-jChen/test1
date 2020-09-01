package com.neuedu.day05;

public class Student extends Person implements Consumer{
	
	public Student(String school) {
		super();
		this.school = school;
	}

	String school;
	public void study() {
		System.out.println("该学生在"+school+"学习");
	}

	@Override
	public void user() {
		// TODO Auto-generated method stub
		
	}
}
