package com.edu.domain;

import com.edu.util.MyDate;

// 직원에 대한 정보를 저장하는 클래스
/*
 * 접근하는 범위를 지정하는 키워드
 * <<Access Modifier>>
 * private : 같은 클래스안에서만 접근 허용
 * +
 * protected
 * +
 * public : 어디서든지 접근을 허용
 */
public class Employee {
	private String name;
	private double salary;
	private MyDate birthDate;
	
	// salary의 기본값 지정 (상수로 지정) 
	public static final double BASIC_SALARY = 100.0;
	public Employee() {}
	
	public Employee(String name, double salary, MyDate birthDate) {  // 생성자
		super();    // ? 
		this.name = name;
		this.salary = salary;
		this.birthDate = birthDate;
	}
	/*
	 * <생성자 앞의 this>
	 * 같은 클래스 내에서 또 다른 생성자를 호출할 때 사용!! 
	 */
	public Employee(String name, MyDate birthDate) {  // 생성자
		this(name, BASIC_SALARY, birthDate);
	}
	
	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public MyDate getBirthDate() {
		return birthDate;
	}

	@Override
	public String toString() {
		return name + "," + salary + "," + birthDate;
	}
	
	

	

}
