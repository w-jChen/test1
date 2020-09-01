package com.neuedu.day04;

public class movePoint {
	public static void main(String[] args) {
		Point point  = new Point(1,2);
		Point point2 = new Point(2,3);
		point.movePoint(3, 4);
		point2.movePoint(5, 8);
		System.out.println("("+point.x+","+point.y+")");
		System.out.println("("+point2.x+","+point2.y+")");

	}
}
