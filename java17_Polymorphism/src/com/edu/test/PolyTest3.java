package com.edu.test;

import com.edu.child.Engineer;
import com.edu.child.Manager;
import com.edu.child.Secretary;
import com.edu.parent.Employee;
import com.edu.service.EmployeeService;
import com.edu.util.MyDate;

public class PolyTest3 {

	public static void main(String[] args) {
		Employee[] emps = {
				new Manager("James", new MyDate(1990, 1, 1), 40000.0, "IT"),
				new Engineer("Tomas", new MyDate(1980,2,18), 48000.0, "Java", 100.0),
				new Secretary("Adams", new MyDate(1995,5,2), 35000.0, "James"),
				new Manager("Janes", new MyDate(1998, 3, 4), 65000.0, "IT")
		};
		
		EmployeeService service = new EmployeeService();
		
		System.out.println("\n==== 1. 직원 정보를 출력합니다 ====");
		service.printAllEmployee(emps);
		
		System.out.println("\n==== 2. 특정 직원을 검색합니다 ====");
		System.out.println(service.findEmployee(emps, "James"));
		
		System.out.println("\n==== 3. 동일한 부서인 직원들을 검색합니다 ====");
		System.out.println(service.findEmployeeByDept(emps,"IT"));
		//for(int i = 0; i < )

		System.out.println("\n==== 4. 특정 직원의 연봉을 검색합니다 ====");
		System.out.println(service.getAnnualSalary(new Secretary("Adams", new MyDate(1995,5,2), 35000.0, "James")));
		
		System.out.println("\n==== 5. 직원의 총 인건비를 검색합니다 ====");
		System.out.println(service.getTotalCost(emps));
	}

}
