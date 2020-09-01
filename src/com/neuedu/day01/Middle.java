package com.neuedu.day01;

public class Middle extends Top {
	public Middle() {
		x += 1;
	}
	public static void main(String[] args) {
		Middle m = new Middle();
		System.out.println(Top.x);
		System.out.println(Middle.x);
	}
}
