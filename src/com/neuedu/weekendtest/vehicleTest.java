package com.neuedu.weekendtest;

public class vehicleTest {
	public static void main(String[] args) {
		Vehicle ve = new Vehicle("比亚迪F0","黄色");
		ve.setSpeed(380);
		System.out.print(ve.getBrand()+""+ve.getColor());
		ve.run();
		System.out.println(ve.getSpeed());
		
		Jcar j = new Jcar("奥迪A7","黑色",5);
		j.setSpeed(220);
		System.out.print(j.getBrand()+""+j.getColor());
		ve.run();
		System.out.println(j.getSpeed()+"载客"+j.getLoader());
	}
}
