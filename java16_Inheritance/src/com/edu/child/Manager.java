package com.edu.child;
/*
  Employee
     |
  Manager
  상속관계시 중요한 지점 
  
  1. 자식 객체 생성시 무조건 부모 객체를 먼저 생성한다
  2. 부모에게서 물려받는 필드에 값 주입은 super() 혹은 super.setXxx() 사용 
  3. 부모에게서 물려받은 메소드는 자식클래스에서 구현부를 자식에게 맞게 고쳐쓴다 
     == > 메서드 오버라이딩
     * 선언부는 모두 일치 
     * 구현부는 반드시 다르게 구현한다 

 */
import com.edu.parent.Employee;
import com.edu.util.MyDate;
//Employee의 기본 생성자 만드니까 에러 없어지는 이유: 
//자식이 생성되려면 반드시 부모가 먼저 생성되어야 해서!
public class Manager extends Employee{   
	private String dept;
	/*
	public Manager(String dept) {
		//자식이 생성되려면 반드시 부모가 먼저 생성되어야 한다
		// **** 자식 생성자 첫라인에서 무조건 부모 생성자 호출이 일어난다
		// 부모 기본 생성자 호출 | 부모 명시적 생성자 호출 
		super();   //부모 기본 생성자 호출 
		this.dept = dept;
	}
	*/
	
	public Manager(String name, MyDate birthday, double salary, String dept) {
		// 생성자 안에서 주입 
		super(name, birthday, salary);  // 부모필드 값 주입
		this.dept = dept; // 자식만의 멤버 값 주입
	}
	
	@Override      // 오버라이드 안할 경우 : dept 가 안나옴 
	public String getDetails() {
		return super.getDetails() + ", dept = " + dept;
	}
	
	
	
	
	
}



//에러코드 not visible 은 있는데 접근이 안되는 그런거... 