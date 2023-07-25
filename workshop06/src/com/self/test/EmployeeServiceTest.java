package com.self.test;



import java.util.ArrayList;

import com.self.service.EmployeeService;
import com.self.service.impl.EmployeeServiceImpl;
import com.self.util.MyDate;
import com.self.vo.Employee;
import com.self.vo.Engineer;
import com.self.vo.Manager;

public class EmployeeServiceTest {
	public static void main(String[] args) {

		EmployeeService service = EmployeeServiceImpl.getInstance();
		
		//2. method를 각각 호출..
		System.out.println("============ 1. addManager ============ ");
		service.addEmployee(new Manager("AAA", new MyDate(1978, 1, 1), 20000.0, "개발부", 10));
		service.addEmployee(new Manager("CCC", new MyDate(1999, 2, 20), 30000.0, "개발부", 10));
		
		System.out.println("============ Manager 정보확인 ============ ");
		service.printEmployee();
		
		System.out.println("\n============ 1. addEngineer ============ ");
		service.addEmployee(new Engineer("EEE", new MyDate(1995,3,4), 350000.0, "Java", 200.0));
		
		
		System.out.println("============ Engineer 정보확인 ============ ");
		service.printEmployee();
		
		System.out.println("\n============ 2. deleteManager(AAA 삭제) ============ ");
		service.deleteEmployee("AAA");
		System.out.println("============ Manager 정보확인 ============ ");
		service.printEmployee();
		
		System.out.println("\n============ 3. updateManager(CCC 연봉 수정 350-->400) ============ ");
		service.updateEmployee(400000.0, "개발부", 10, "EEE");
		System.out.println("============ Manager 정보확인 ============ ");
		service.printEmployee();
		
		System.out.println("\n============ 4. findEmployee(BBB) ============ ");
		Employee retM1=service.findEmployee("EEE");
		System.out.println(retM1.toString());
		
		System.out.println("\n============ 4. findEmployeeByDept('개발부') ============ ");
		System.out.println("개발 부서에 근무하는 직원들 입니다..");
		ArrayList<Employee> retMs1 = service.findEmployeeByDept("개발부");
		for(Employee m : retMs1) {
			if(m==null) continue;
			System.out.println(m.toString());
		}
	}
}







