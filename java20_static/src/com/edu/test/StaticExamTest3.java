package com.edu.test;
/*
  static 키워드와 가장 많이 함께 쓰이는 키워드는 final 
  Usage Modifier
  static final / final static 둘 다 상관은 없음
  
  final :: 내가 마지막이야~~~
  final + 변수  : 내가 마지막 변수 :: 상수값
  final + 메소드 : 내가 마지막 메소드 :: 오버라이딩 금지 
  final + 클래스 : 내가 마지막 클래스 :: 상속 금지 
  
 */
class A {
	public static final int BASIC_SALARY = 30000;
	public final String test() {
		return "오버라이딩 금지";
	}
}
final class B {
	
}
//class C extends B {
//	
//}
class D extends A {
//	public final String test() {
//		return "오버라이딩 금지";
//	}
 // BASIC_SALARY = 50000;
}
public class StaticExamTest3 {

	public static void main(String[] args) {
		
	}

}
