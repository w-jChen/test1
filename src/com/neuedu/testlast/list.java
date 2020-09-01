package com.neuedu.testlast;

import java.util.LinkedList;
import java.util.Scanner;

public class list {
	static LinkedList<Integer> ll = new LinkedList<>();
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		for(int i = 0;i<3;i++)
			put(scan.nextInt());
		for(int i = 0;i<3;i++)
			System.out.println(ll.get(i));
		for(int i = 0;i<3;i++)
			get();
		System.out.println(ll.isEmpty());
	}
	public static void put(Object o) {
		ll.add((Integer) o);
	}
	public static void get() {
		ll.remove();
	}
}
