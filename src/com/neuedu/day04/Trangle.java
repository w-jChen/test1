package com.neuedu.day04;

public class Trangle {
	private int a;
	public Trangle() {
		
	}
	public Trangle(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		if(a+b<c&&a+c<b&&b+c<a)
			System.out.println("边长输入错误");
		else
			this.c = c;
	}
	private int b;
	private int c;
}
