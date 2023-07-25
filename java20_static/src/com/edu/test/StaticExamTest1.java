package com.edu.test;

class StaticExam{
	static String name = "James";
	static int age = 44;
	int count = 1;
	
	public static void getMember() {
		System.out.println("우/유/빛/깔/ " + name);
	}
	
	public void getMember2() {
		//static String address = "역삼동"; 안되는 이유 --> 
		System.out.println("우/유/빛/깔/ " + name);
	}
}
public class StaticExamTest1 {

	public static void main(String[] args) {
		// 객체 생성과정 없이 바로 사용 가능하다 --> static은 메모리에 올려서 
		StaticExam.getMember();
		
		//객체 생성 == 클래스의 getMember2() 가 메모리에 올라간다
		StaticExam se = new StaticExam();
		se.getMember2();  
	}

}
