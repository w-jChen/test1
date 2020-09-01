package com.neuedu.object;

import java.util.Scanner;

/*
 * 给定一个正整数n，求一个正整数p，满足p仅包含n的所有素因子，且每个素因子的次数不大于1
 * */
public class suyingzi {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String n = scan.next();
		String p = "";
		for(int i = 0;i<n.length();i++) {
			int j = 0;
			for(;j<p.length();j++) {
				if(n.charAt(i) == p.charAt(j))
					break;
			}
			if(j == p.length()) {
				p = p+n.charAt(i);
			}
		}
		System.out.println(p);
	}
}
