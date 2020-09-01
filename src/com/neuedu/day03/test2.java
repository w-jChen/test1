package com.neuedu.day03;

public class test2 {
  public static void main(String[] args) {
	sy();
	int a = c(10,20);
	System.out.println(a);
	int sum = d(10,20);
	System.out.println(sum);
 }
  public static void sy() {
	  System.out.println("Hello");
  }
  public static int c(int a,int b) {
	  if(a>b)
		  return a - b;
	  else
		  return b - a;
		  
  }
  public static int d(int a,int b) {
		  return a + b; 
  }
}
