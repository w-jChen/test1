package com.neuedu.day03;

import java.util.Scanner;

public class test3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int x = nian(a);
		if(x == 1)
			System.out.println("是闰年");
		else
			System.out.println("是平年");
	}
	public static int nian(int a)
	{
		if(a%4 == 0&&a%100 != 0||a%400 == 0)
			return 1;
		else 
			return 0;
	}
}
