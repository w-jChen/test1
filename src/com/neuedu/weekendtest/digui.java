package com.neuedu.weekendtest;
import java.util.Scanner;
public class digui {	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = fun(a);
		int x = 0;
		while(true) {
			x = b%10;
			b = b/10;
			if(x!=0) {
				System.out.println(x);
				break;
			}
		}
	}
	public static int fun(int i) {
		if(i == 0||i == 1)
			return 1;
		else 
			return i*fun(i - 1)%100000;
	}
}
