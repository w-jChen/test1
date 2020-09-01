package com.neuedu.day06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class ListTest {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		while(hs.size()<7) {
			hs.add((int)((Math.random())*100+1)%25);
		}
		System.out.println("------数组-------");
		Object o[] = hs.toArray();
		for(int i = 0;i<o.length;i++) {
			System.out.println(o[i]);
		}
		System.out.println("------循环-------");
		for(int i : hs)
			System.out.println(i);
		System.out.println("------迭代器-------");
		Iterator<Integer> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("-----------------");
		System.out.println(Collections.max(hs));
		ArrayList ar = new ArrayList();
		ar.add(5);
		ar.add(7);
		ar.add(3);
		ar.add(2);
		System.out.println(ar);
		Collections.sort(ar);
		System.out.println(ar);
		Collections.reverse(ar);
		System.out.println(ar);
	}
}
