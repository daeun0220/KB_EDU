package com.edu.domain.test;

import com.edu.domain.Employee;
import com.edu.util.MyDate;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp1 = new Employee("James", new MyDate(2000, 1, 1));   // 2개 짜리 생성자 오버로딩해서 ㄱㅊ --> 정해둔 기본값으로 채워진다
		Employee emp2 = new Employee("Tomas", 340000.0, new MyDate(1999, 4, 22));
		Employee emp3 = new Employee("Jane", 670000.0, new MyDate(1980, 11, 12));
		
		Employee[] emps = {emp1, emp2, emp3}; // 배열에는 같은 type만 들어갈 수 있다 
		for(Employee emp : emps)
			System.out.println(emp);
	}

}
