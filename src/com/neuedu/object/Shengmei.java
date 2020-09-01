package com.neuedu.object;

import java.util.Scanner;
/*	《审美的历程》课上有n位学生，帅老师展示了m幅画，
 * 其中有些是梵高的作品，另外的都出自五岁小朋友之手。
 * 老师请同学们分辨哪些画的作者是梵高，但是老师自己并没有答案，
 * 因为这些画看上去都像是小朋友画的……老师只想知道，有多少对
 * 同学给出的答案完全相反，这样他就可以用这个数据去揭穿披着皇帝
 * 新衣的抽象艺术了
	　　答案完全相反是指对每一幅画的判断都相反。
	　第一行两个数n和m，表示学生数和图画数；
　　接下来是一个n*m的01矩阵A：
　　如果aij=0，表示学生i觉得第j幅画是小朋友画的；
　　如果aij=1，表示学生i觉得第j幅画是梵高画的。
	*/
class Shengmei {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[][] x = new int[n][m];
		int count = 0;
		System.out.println("输入数据");
		for(int i = 0;i<n;i++) 
			for(int j = 0;j<m;j++) {
				x[i][j] = scan.nextInt();
			}
		for(int i = 0;i<n;i++) {
			for(int j = i+1;j<n;j++) {
				int k = 0;
				for(;k<m;k++) {
					if(x[i][k] == x[j][k])
						break;
				}
				if(k == m)
					count++;
			}
		}
		System.out.println(count);
	}
}
