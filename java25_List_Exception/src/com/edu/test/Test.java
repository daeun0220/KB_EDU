package com.edu.test;

public class Test {

	public static void main(String[] args) {
		String str1 = new String("JAVA");
		String str2 = new String("JAVA");  // Heap에 올라가는 다른 객체 
		
		String str3 = "JAVA";   // Heap에 안올라간다
		String str4 = "JAVA";   // JVM은 Java String Pool 에 String 문자열을 관리한다
		                        // 메모리 공간에 중복되지 않는 String 문자열을 저장한다
		System.out.println(str1==str2);  //f
		System.out.println(str1.equals(str2));  //t
		System.out.println(str3==str4);  //t
	}

}
