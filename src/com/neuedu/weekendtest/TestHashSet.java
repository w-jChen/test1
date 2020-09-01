package com.neuedu.weekendtest;

import java.util.ArrayList;
import java.util.HashSet;

public class TestHashSet {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("第一个元素");
		hs.add("第二个元素");
		hs.add("第三个元素");
		ArrayList ar = new ArrayList();
		ar.add(123);
		ar.add(456);
		hs.addAll(ar);
		Object o[] = hs.toArray();
		for(int i = 0;i<o.length;i++) {
			System.out.println(o[i]);
		}
	}
}
