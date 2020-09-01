package com.neuedu.day02;

public class test2 {
	public static void main(String[] args) {
		int count = 0;
//		for(int i = 1;i<=100;i++) {
//			count = count + i;
//		}
		int i = 1;
//		while(i<=100) {
//			count = count + i;
//			i++;
//		}
		do {
			count = count + i;
			i++;
		}while(i<=100);
		System.out.println(count);
		int count2 = 0;
		for(int j = 1;j<100;j = j+2) {
			count2 = count2 + j;
		}
		System.out.println(count2);
	}
	
}
