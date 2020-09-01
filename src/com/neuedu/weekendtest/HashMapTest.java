package com.neuedu.weekendtest;

import java.util.HashMap;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String,String> color = new HashMap<String,String>();
		
		color.put("red", "红色");
		
		System.out.println(color.size());
	}
}
