package com.neuedu.day02;

import java.util.Random;

public class kehou4 {
	public static void main(String[] args) {
		Random random = new Random();
		int a = random.nextInt(10);
		if(a == 1)
			System.out.println("x="+a);
		else if(a == 5)
			System.out.println("x="+a);
		else if(a == 10)
			System.out.println("x="+a);
		else
			System.out.println("x=none");
	}
	
}
