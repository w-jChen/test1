package com.neuedu.weekendtest;

public class Vehicle extends Car{
	private String brand;
	private String color;
	private double speed;
	public String getBrand() {
		return brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public Vehicle(String brand, String color) {
		super();
		this.brand = brand;
		this.color = color;
		this.speed = 0;
	}
	
}
