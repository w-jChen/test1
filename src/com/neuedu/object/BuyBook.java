package com.neuedu.object;

public class BuyBook {
	public static void main(String[] args) {
		int x = 10,y = 15,z = 20;
		int count = 0;
		for(int i = 0;i<=30;i++) 
			for(int j = 0;j<=30;j++) 
				for(int k = 0;k<=30;k++) {
					if(((i*x+j*y+z*k)==500)&&((i+j+k)==30)) {
						System.out.println(i+","+j+","+k);
						count++;
					}
				}
		System.out.println(count);
	}
}
