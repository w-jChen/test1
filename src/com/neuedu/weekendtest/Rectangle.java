package com.neuedu.weekendtest;

public class Rectangle extends Shape {

	public Rectangle(double area, double per, String color) {
		super(area, per, color);
		// TODO Auto-generated constructor stub
	}
	public Rectangle(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.width*this.hight;
	}

	@Override
	public double getPer() {
		// TODO Auto-generated method stub
		return 2*(this.width+this.hight);
	}
	private int width;
	private int hight;
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHight() {
		return hight;
	}
	public void setHight(int hight) {
		this.hight = hight;
	}
	@Override
	public double showAll() {
		// TODO Auto-generated method stub
		System.out.println("面积"+getArea()+"周长"+getPer()+"颜色"+super.getColor());
		return 0;
	}
	
	public Rectangle( String color, int width, int hight) {
		super(color);
		this.width = width;
		this.hight = hight;
	}
	public Rectangle() {
		super();
	}
	
}
