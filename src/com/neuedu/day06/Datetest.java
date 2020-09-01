package com.neuedu.day06;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Datetest {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String str = "2020-07-17";
		Date date = new Date();
		try {
			date = sdf.parse(str);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(sdf.format(date));
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		long x1 = Long.parseLong(str.replace("-", ""));
		String str2 = sdf.format(new Date());
		long x2 = Long.parseLong(str2.replace("-", ""));
		if((x2 - x1) > a)
			System.out.println("过期");
		else
			System.out.println("还有"+(a - (x2- x1))+"天");
	}
}
