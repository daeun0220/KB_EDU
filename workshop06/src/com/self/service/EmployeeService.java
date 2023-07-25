package com.self.service;

import java.util.ArrayList;

import com.self.vo.Employee;
import com.self.vo.Manager;

public interface EmployeeService {
	void addEmployee(Employee e);
	void deleteEmployee(String name);
	void updateEmployee(double salary, String dept, int deptno, String name);
	void updateEmployee(double salary, String tech, double bonus,  String name);
	Employee findEmployee(String name);
	ArrayList<Employee> findEmployeeByDept(String dept);
	ArrayList<Employee> findEmployeeByTech(String tech);
	void printEmployee();

}
