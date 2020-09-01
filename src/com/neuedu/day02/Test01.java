package com.neuedu.day02;

import java.util.Random;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		int a = 1,b = 2,t;
		t = a;
		a = b;
		b = t;
		
		
		int x = 999,sum=0;
		int y;
		for(int i = 0;i<3;i++) {
			y = x%10;
			sum = sum+y;
			x = x/10;
		}
		System.out.println(sum);
		
		int n = 10,m = 20;
		if(n>m)
			System.out.println(n);
		else
			System.out.println(m);
			
			int nian = 2064;
			if(nian%400==0||nian%4==0&&nian%100!=0) 
				System.out.println("是闰年");
				else
				System.out.println("是平年");
			
		int month = 2;
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31天");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30天");
			break;
		case 2:
			System.out.println("28天");
			break;
		}
		
		Scanner scan = new Scanner(System.in);
		String sClass = scan.next();
		System.out.println(sClass);
		
		Random random = new Random();
		int num = random.nextInt(10);
		System.out.println(num);
		
		int count = 0;
//		for(int i = 1;i<=100;i++) {
//			count = count + i;
//		}
		int i = 1;
		while(i<=100) {
			count = count + i;
		}
		System.out.println(count);
	}
}
