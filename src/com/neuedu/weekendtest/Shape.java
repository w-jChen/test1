package com.neuedu.weekendtest;

public abstract class Shape {
	private double area;
	private double per;
	private String color;
	public abstract double getArea();
	public abstract double getPer();
	public abstract double showAll();
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public void setPer(double per) {
		this.per = per;
	}
	public Shape(double area, double per, String color) {
		super();
		this.area = area;
		this.per = per;
		this.color = color;
	}
	public Shape(String color) {
		super();
		this.color = color;
	}
	public Shape() {
		super();
	}
	
	
}
