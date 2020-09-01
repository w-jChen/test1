package com.neuedu.weekendtest;

import java.util.Random;

public class maopao {
	public static void main(String[] args) {
		int[] x = new int[12];
		Random rand = new Random();
		for(int i = 0;i< 12;i++ ) {
			x[i] = rand.nextInt(10);
		}
		for(int i = 0;i<x.length;i++) {
			for(int j = 0;j<x.length-i-1;j++) {
				if(x[j] > x[j+1]) {
					int t = x[j];
					x[j] = x[j+1];
					x[j+1] = t;
				}
			}
		}
		for(int i = 0;i<x.length;i++) {
			System.out.println(x[i]);
		}
	}
}
