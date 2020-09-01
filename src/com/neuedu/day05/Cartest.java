package com.neuedu.day05;

import java.util.Scanner;

public class Cartest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		String a = scan.next();
		if(a.equals("客车")) {
			Kcar k = new Kcar();
			k.shoufei();
		}else if(a.equals("货车")) {
			Hcar c = new Hcar();
			c.shoufei();
		}else if(a.equals("轿车")) {
			Jcar j = new Jcar();
			j.shoufei();
		}
	}
}
