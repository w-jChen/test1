package com.neuedu.day04;

public class Point {
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	int x;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	int y;
	
	public void movePoint(int dx,int dy) {
		x = x+dx;
		y = y+dy;
	}
}
