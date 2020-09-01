package com.neuedu.day03;

import java.util.Random;
import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		int[] num  = {0,1,2,3};
		int[] num2 = new int[10] ;
		
		int[] x = new int[5];
		Random random = new Random();
		for(int i = 0;i<5;i++) {
			x[i] = random.nextInt(10);
		}
		for(int i:x) {
			System.out.println(i);
		}
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0;;i++)
		{
			int a = scan.nextInt();
			if(a == '\n'||a == '\r')
				break;
			else
				num2[i] = a;
		}
		for(int i:num2) {
			System.out.println(i);
		}
	}
}
