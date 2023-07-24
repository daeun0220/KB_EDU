package com.edu.child;

import com.edu.parent.Parent;

public class Child extends Parent{
// 자식 클래스..
	public void test() {
		//부모클래스(다른 디렉토리, 패키지에 들어있다)의 필드에 접근
		System.out.println(publicVar);
		System.out.println(protectedVar);
		
//		System.out.println(var);    // The field Parent.Var is not visible 에러
//		System.out.println(privateVar);   // 있는데 접근안된다는 뜻 
	}
}
