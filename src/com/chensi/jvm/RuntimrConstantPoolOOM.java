package com.chensi.jvm;
/**
* 2019年3月14日
* chensi
**/
public class RuntimrConstantPoolOOM {

	public static void main(String[] args) {
		String str1 = new StringBuilder("计算机").append("软件").toString();
		System.out.println(str1.intern() == str1);
		
		String str2 = new StringBuilder("ja").append("va").toString();
		System.out.println(str2.intern() == str2);
	}

}
