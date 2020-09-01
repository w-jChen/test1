package com.neuedu.day05;

public class stest {
	public static void main(String[] args) {
		Student stu = new Student("武汉工商");
		stu.setAge(22);
		stu.setpName("陈玉琳");
		stu.setSex("女");
		System.out.println(stu.getpName()+","+stu.getSex()+","+stu.getAge());
		stu.study();
	}
}
