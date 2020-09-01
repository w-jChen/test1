package com.neuedu.day05;

public class Employee {
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	public int getBirth() {
		return birth;
	}
	public void setBirth(int birth) {
		this.birth = birth;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	int name;
	int birth;
	int salary;
	public Employee(int name, int birth, int salary) {
		super();
		this.name = name;
		this.birth = birth;
		this.salary = salary;
	}
	public Employee() {
		super();
		System.out.println("111");
	}
	
	
}
