package com.neuedu.day02;

import java.util.Scanner;

public class kehou1 {
	public static void main(String[] args) {
		System.out.println("输入利润");
		Scanner scan = new Scanner(System.in);
		int li = scan.nextInt();
		
		double sum = 0;
		if(li>1000000)
		{
			sum = sum+(li-1000000)*0.01;
			li = 1000000;
		}
		if(li>600000)
		{
			sum = sum+(li-600000)*0.015;
			li = 600000;
		}
		if(li>400000)
		{
			sum = sum+(li-400000)*0.03;
			li = 400000;
		}
		if(li>200000)
		{
			sum = sum+(li-200000)*0.05;
			li = 200000;
		}
		if(li>100000)
		{
			sum = sum+(li-100000)*0.075;
			li = 100000;
		}
		sum = sum+li*0.1;
		System.out.println("奖金总数："+sum);
	}
}
