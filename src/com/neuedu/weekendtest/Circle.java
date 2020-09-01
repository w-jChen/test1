package com.neuedu.weekendtest;

public class Circle extends Shape {

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.radius*this.radius*Math.PI;
	}

	@Override
	public double getPer() {
		// TODO Auto-generated method stub
		return 2*this.radius*Math.PI;
	}

	@Override
	public double showAll() {
		// TODO Auto-generated method stub
		System.out.println("面积"+getArea()+"周长"+getPer()+"颜色"+super.getColor());
		return 0;
	}
	private int radius;
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public Circle(String color, int radius) {
		super(color);
		this.radius = radius;
	}
	
	
}
