package com.neuedu.weekendtest;

public class Players {
	static int sum;
	public Players() {
		// TODO Auto-generated constructor stub
		if(sum>10) {
			System.out.println("你已经创建"+sum+"个对象");
		}else {
			System.out.println("创建了一个对象,不能再创建了");
		}
		this.sum++;
	}
	public static int getSum() {
		return sum;
	}
	public static void setSum(int sum) {
		Players.sum = sum;
	}
	
}
