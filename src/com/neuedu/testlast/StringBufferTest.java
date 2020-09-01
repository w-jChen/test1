package com.neuedu.testlast;

public class StringBufferTest {

	public static void main(String[] args) {
		//默认16字符缓冲区
		StringBuffer bf1=new StringBuffer();
		//指定缓冲区长度
		StringBuffer bf2=new StringBuffer(64);
		//使用字符串初始化缓冲区值
		StringBuffer bf3=new StringBuffer("hello");
		
		//返回当前容量
		System.out.println("bf1的容量为："+bf1.capacity());
		System.out.println("bf2的容量为："+bf2.capacity());
		System.out.println("bf3的容量为："+bf3.capacity());
		//返回字符数
		System.out.println("b3的长度为:"+bf3.length());
		//内容逆序
		System.out.println(bf3.reverse());
		//将给点索引处的字符设置字符
		bf3.setCharAt(0, 'g');
		System.out.println(bf3);
		//移除序列的字符串中字符
		System.out.println(bf3.delete(0, 2));
		//返回序列指定索引处char值
		System.out.println(bf3.charAt(0));
		//将指定字符串追加到最后
		StringBuffer bf4=new StringBuffer("wang");
		System.out.println(bf4.append("ye"));
		//将字符串插入指定位置
		System.out.println(bf4.insert(1,"111"));

		StringBuffer bf5 = new StringBuffer("hello");
		StringBuffer bf6 = new StringBuffer("hello");
		System.out.println(bf5 == bf6);   //false
		System.out.println(bf5.equals(bf6));   //false
		System.out.println(bf5.toString().equals(bf6.toString()));  //true
		
	}
}
