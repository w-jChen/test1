package com.neuedu.day06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class LinkListTest {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = 1;i<6;i++) {
			arr.add(i);
		}
		for(int i : arr) {
			System.out.print(i);
		}
		System.out.println();
		
		ArrayList<String> arr2 = new ArrayList<>();
		arr2.add("apple");
		arr2.add("banana");
		arr2.add("pear");
		System.out.println(Collections.max(arr2));
		System.out.println(Collections.min(arr2));
		Collections.sort(arr2);
		System.out.println(arr2);
		
		HashMap<Integer, String> hm1 = new HashMap<>();
		HashMap<String, Integer> hm2 = new HashMap<>();
		hm1.put(1,"wjc");
		hm2.put("wjc", 10000);
		hm1.put(2,"cyl");
		hm2.put("cyl", 10000000);
		System.out.println(hm1.get(1)+"余额"+hm2.get(hm1.get(1)));
		System.out.println(hm1.get(2)+"余额"+hm2.get(hm1.get(2)));
		
		ArrayList<String> arr3 = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		while(true) {
			String a = scan.next();
			if(a.equals(" "))
				break;
			arr3.add(a);
		}
		Collections.sort(arr3);
		
	}
}
