package com.neuedu.weekendtest;

import java.util.ArrayList;
import java.util.Scanner;

public class TestList {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> score =new ArrayList<Integer>();
		while(true) {
			System.out.println("打分：");
			int s = scan.nextInt();
			if(s == 0)
				break;
			score.add(s);
		}
		int count = 0;
		for(int i = 0;i<score.size();i++) {
			count += score.get(i);
		}
		double a = count/score.size();
		System.out.println(a);
	}
	/*
	 * 常用方法
	 * 在指定位置添加元素
	 * void add(int index,Object o)
	 * boolean addAll(int index,Collection c)
	 * 删除指定位置的元素
	 * Object remove(int index)
	 * 获取某个/某些元素
	 * Object get(int index)
	 * List subList(int fromIdex,int toIndex)
	 * 查找元素
	 * int indexOf(Object o)
	 * int lastIndexOf(Object o)
	 * 修改指定位置上的元素
	 * Object set(int index,Object o)
	 * 装换成迭代器元素
	 * Listlterator listlterator()
	 * Listlterator listlterator(int index)
	 * */
}
