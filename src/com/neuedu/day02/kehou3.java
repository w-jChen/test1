package com.neuedu.day02;

import java.util.Scanner;

public class kehou3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		if(a%2==0)
			System.out.println("偶数");
		else
			System.out.println("奇数");
	}
}
