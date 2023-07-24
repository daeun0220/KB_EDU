package com.self.service.impl;

import com.self.vo.Manager;

public interface EmployeeServiceImpl {
	void addManager(Manager m);
	void deleteManager(String name);
	void updateManager(double salary, String dept,int deptno,  String name);

}
