package com.edu.test;

import com.edu.child.Engineer;
import com.edu.child.Manager;
import com.edu.child.Secretary;
import com.edu.parent.Employee;
import com.edu.util.MyDate;

public class PolyTest2 {

	public static void main(String[] args) {
		Employee[] emps = {
				new Manager("James", new MyDate(1990, 1, 1), 40000.0, "IT"),
				new Engineer("Tomas", new MyDate(1980,2,18), 48000.0, "Java", 100.0),
				new Secretary("Adams", new MyDate(1995,5,2), 35000.0, "James")
		};
		
		System.out.println("=== 정보 출력합니다 ===");
		for(Employee e : emps)
			System.out.println(e);
		
		System.out.println("\n === 직원들의 연봉정보를 출력합니다 ===");
		// employee 돌면서 manager, engineer, secretary 를 구분하기 위해 instanceof 를 사용한다
		double annualSalary = 0.0;
		for(Employee e : emps) {
			if(e instanceof Engineer) {
				annualSalary = e.getSalary()*12 +((Engineer) e).getBonus();
				System.out.println(e.getName()+ "님의 연봉," + annualSalary);
			} else {
				annualSalary = e.getSalary()*12;
				System.out.println(e.getName()+ "님의 연봉," + annualSalary);
			}
		}
	}

}
