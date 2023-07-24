package com.edu.service.impl;

import com.edu.child.Engineer;
import com.edu.child.Manager;
import com.edu.parent.Employee;
import com.edu.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService{

	@Override
	public void printAllEmployee(Employee[] emps) {
		for(Employee e : emps)
			System.out.println(e);
		
	}

	@Override
	public Employee findEmployee(Employee[] emps, String name) {
		Employee employee = null;
		for(Employee e : emps) {
			if(e.getName().equals(name)) {
				employee = e;
				break;   // 한명만 찾으면 되니까 break 달아주는것이 중요! 
			}
		}
		return employee;
	}

	@Override
	public Employee[] findEmployeeByDept(Employee[] emps, String dept) {
		Employee[] temp = new Employee[emps.length];
		int idx = 0;
		for(Employee e : emps) {
			if(e instanceof Manager) {
				if(((Manager) e).getDept().equals(dept)) {
					temp[idx++] = e;
				}
			}
		}
		return temp;
	}

	@Override
	public double getAnnualSalary(Employee e) {
		double annualSalary = 0;
		annualSalary += e.getSalary()*12;
		if(e instanceof Engineer) {
			annualSalary += e.getSalary()*12 +((Engineer) e).getBonus();
		} 
		return annualSalary;
	}

	@Override
	public double getTotalCost(Employee[] ea) {
		double total = 0;
		for(Employee e : ea) {
			total += getAnnualSalary(e);
		}
		return total;
	}

}
