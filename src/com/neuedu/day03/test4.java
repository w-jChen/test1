package com.neuedu.day03;

public class test4 {
	public static void main(String[] args) {
		int a = su();
		System.out.println(a);
	}
	public static int su() {
		for(int i = 200;;i++)
		{
			int j = 2;
			for(;j<i;j++) {
				if(i%j == 0)
					break;
			}
			if(i == j)
				return i;
		}
	}
}
