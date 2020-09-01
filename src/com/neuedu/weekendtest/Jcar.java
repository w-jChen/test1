package com.neuedu.weekendtest;

public class Jcar extends Vehicle {

	public Jcar(String brand, String color,int loader) {
		super(brand, color);
		this.loader = loader;
		// TODO Auto-generated constructor stub
	}
	private int loader;
	public int getLoader() {
		return loader;
	}
	public void setLoader(int loader) {
		this.loader = loader;
	}
	public void run() {
		System.out.print("老子巨能跑");
	}
	
}
