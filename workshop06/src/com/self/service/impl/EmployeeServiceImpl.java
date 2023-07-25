package com.self.service.impl;


import java.util.ArrayList;
import com.self.service.EmployeeService;
import com.self.vo.Employee;
import com.self.vo.Engineer;
import com.self.vo.Manager;

public class EmployeeServiceImpl implements EmployeeService {
	int idx = 0;
	private ArrayList<Employee> list;
	
//    public EmployeeServiceImpl(int size) {
//    	list = new ArrayList<>();
//    }
    //1
    static private EmployeeServiceImpl service = new EmployeeServiceImpl();
	
	//2
	private EmployeeServiceImpl() {
		list = new ArrayList<>();
		System.out.println("Client Request Ready");
	}
	//3
	public static EmployeeServiceImpl getInstance() {
		return service;
	}
	// 직원등록 
	public void addEmployee(Employee e) {   
		boolean find = false;
		for(Employee employee : list) {
			if(employee.getName().equals(e.getName())) {
				find = true;
				System.out.println("이미 존재합니다");
				return;
			}
		}
		if(find==false) {
			list.add(e);
			System.out.println(e.getName()+ "님 회원등록 성공! ");
		}

	}
	// 직원삭제
	public void deleteEmployee(String name) {
		boolean find = false;
		for(Employee employee : list) {
			if(employee.getName().equals(name)) {
				find = true;
				System.out.println(employee.getName()+ "님 회원 탈퇴!");
				list.remove(employee);
				break;
			}
		}
		if(find==false) System.out.println("삭제대상이 존재하지 않습니다");
	}
	
	// 매니저 직원 정보수정 
	public void updateEmployee(double salary, String dept, int deptno, String name) {
		for(Employee e : list) {
			if(e instanceof Manager) {
				if(e.getName().equals(name)) {
					((Manager) e).setSalary(salary);
					((Manager) e).setDept(dept);;
					((Manager) e).setDeptno(deptno);;
					break;
				}
			}
		}
		
	}
	// 엔지니어 직원 정보수정
	public void updateEmployee(double salary, String tech, double bonus,  String name) {
		for(Employee e : list) {
			if(e instanceof Engineer) {
				if(e.getName().equals(name)) {
					((Engineer) e).setSalary(salary);
					((Engineer) e).setTech(tech);
					((Engineer) e).setBonus(bonus);;
					break;
				}
			}
		}
		
	}
	
	// 직원 찾기 
	public Employee findEmployee(String name) {
		Employee employee = null;
		for(Employee e : list) {
			if(e.getName().equals(name)) {
				employee = e;
				break;
			}
		}
		return employee;
	}
	
	// 같은 부서 직원 찾기 
	public ArrayList<Employee> findEmployeeByDept(String dept) {
		ArrayList<Employee> people = new ArrayList<>();
		for(Employee e : list) {
			if(e instanceof Manager) {
				if(((Manager) e).getDept().equals(dept)) {
					people.add(e);
				}
			}
		}
		return people;
		
	}
	// 같은 기술 보유한 직원 찾기 
	public ArrayList<Employee> findEmployeeByTech(String tech) {
		ArrayList<Employee> people = new ArrayList<>();
		for(Employee e : list) {
			if(e instanceof Engineer) {
				if(((Engineer) e).getTech().equals(tech)) {
					people.add(e);
				}
			}
		}
		return people;
	}
	
	// 프린트
	public void printEmployee() {
		for(Employee e : list) {
			if(e!=null)
			System.out.println(e.toString());
		}
	}
	
	
}

