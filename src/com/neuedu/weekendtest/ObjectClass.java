package com.neuedu.weekendtest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ObjectClass {
	public static void main(String[] args) {
		String a = "500";
		int b = Integer.parseInt(a);
		System.out.println(b);
		String num = String.valueOf(b);
		System.out.println(num);
		Scanner scan =new Scanner(System.in);
//		String str = scan.next();
//		String x = str.substring(3,7);
//		System.out.println(str.replace(x,"****"));
		
		
//		int x1 = scan.nextInt();
//		int x2 = scan.nextInt();
//		int x3 = scan.nextInt();
//		int p = (x1+x2+x3)/2;
//		System.out.println(Math.sqrt(p*(p-x1)*(p-x2)*(p-x3)));
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String x = "2020-07-28";
		String y = "2020-07-27";
		Date date = new Date();
		long x2 = Long.parseLong(x.replaceAll("-", ""));
		long y2 = Long.parseLong(y.replaceAll("-", ""));
		if(x2 > y2) {
			try {
				date = sdf.parse(x);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(sdf.format(date));
		}else {
			try {
				date = sdf.parse(y);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(sdf.format(date));
		}
		
		
		
	}
}
