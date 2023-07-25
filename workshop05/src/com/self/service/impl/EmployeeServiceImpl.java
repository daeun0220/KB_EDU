package com.self.service.impl;


import com.self.service.EmployeeService;
import com.self.vo.Employee;
import com.self.vo.Engineer;
import com.self.vo.Manager;

public class EmployeeServiceImpl implements EmployeeService {
	int idx = 0;
	Employee[] emp = new Employee[5];

	public void addEmployee(Employee e) {
		emp[idx++] = e;

	}
	public void deleteEmployee(String name) {
		for(int i = 0; i < idx; i++) {
			if(emp[i].getName().equals(name)) {
				for(int j = i; j < idx; j++) {
					emp[j] = emp[j+1];
				}
				emp[idx--] = null;
			}
		}
	}
	public void updateEmployee(String name, double salary) {
		for(Employee e : emp) {
			if(e.getName().equals(name)) {
				e.setSalary(salary);
				break;
			}
		}
		
	}
	//Method Overloading
	/*
	 * 하는일은 똑같은데...처리하는 데이타를 달리할때 쓰는 기법
	 * 메소드의 통일감을 강조하면서도 서로다른 데이타를 처리할수 있게끔 해준다.
	 */
	public Employee findEmployee(String name) {
		Employee employee = null;
		for(Employee e : emp) {
			if(e == null) continue;
			if(e.getName().equals(name)) {
				employee = e;
				break;
			}
		}
		return employee;
	}
	
	public Employee[] findEmployeeByDept(String dept) {
		Employee[] temp = new Employee[emp.length];
		int idx = 0;
		for(Employee e : emp) {
			if(e instanceof Manager) {
				if(((Manager) e).getDept().equals(dept)) {
					temp[idx++] = e;
				}
			}
		}
		return temp;
		
	}
	
	public void printEmployee() {
		for(Employee e : emp) {
			if(e!=null)
			System.out.println(e.toString());
		}
	}
	
}

