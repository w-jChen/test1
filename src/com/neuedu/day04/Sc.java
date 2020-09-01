package com.neuedu.day04;

public class Sc {
	public static void main(String[] args) {
		Sp s = new Sp();
		s.setName("可乐");
		s.setPrice(2.5);
		System.out.println(s.getName()+s.getPrice());
		s.setName("鼠标");
		s.setPrice(50);
		System.out.println(s.getName()+s.getPrice());

	}
}
