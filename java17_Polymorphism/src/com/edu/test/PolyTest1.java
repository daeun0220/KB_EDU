package com.edu.test;
/*
  Polymorphism
  ::
  부모타입으로 다양한 자식객체를 생성
  1) Object Casing
  2) Virtual Method Invocation
  
 */
import com.edu.child.Engineer;
import com.edu.child.Manager;
import com.edu.child.Secretary;
import com.edu.parent.Employee;
import com.edu.util.MyDate;

public class PolyTest1 {

	public static void main(String[] args) {
		
		Employee m = new Manager("James", new MyDate(1990, 1, 1),
								40000.0, "IT");
		Employee eg =new Engineer("Tomas", new MyDate(1980,2,18),
				                   48000.0, "Java", 100.0);		
		Employee s =new Secretary("Adams", new MyDate(1995,5,2),
				                    35000.0, "James");
		
		//1. James  의 부서를 Marketing 부서로 변동...changeDept()사용
//		Manager m1 = (Manager)m;
//		m1.changeDept("Marketing");
		
		((Manager) m).changeDept("Marketing");
		
		//2. 정보출력
		/*
		  Virtual Method Invocation 원리
		  상속관계의 오버라이딩된 메소드에서
		  부모타입으로 자식객체를 생성했을때 발생하는 원리
		  
		  1. 컴파일 시점 --- 부모의 메소드의 호출
		  2. 런타입 시점 --- 실질적으로 생성된 자식의 메소드를 호출 
		 */
		System.out.println(m.toString());		
		System.out.println(eg);
		System.out.println(s);

	}
}