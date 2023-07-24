package com.edu.service;

import com.edu.child.Engineer;
import com.edu.child.Manager;
import com.edu.parent.Employee;

/*
 Heterogeneous Collection
 이기종간의 집합체를 관리하는 기능만으로 작성된 서비스 클래스
 가장 기본적인 기능은 CRUD 
 
 1. 가장 원시적인 레벨의 서비스 기능 정의 
    => 상속을 안했을때
    Manager      Engineer      Secretary
    
    step1.
    >>> 추가 관련된 기능 ..C 
    public void addManager(Manager m){//}
    public void insertEngin(Engineer m){//}
    public void secretaryPlus(Secretary m){//}
    
    step2.
    >>> 추가 관련된 기능 ..C 상속X 경우 / identifier를 일관적으로 만들어준다 
    public void addManager(Manager m){//}
    public void addEngineer(Engineer m){//}
    public void addsecretary(Secretary m){//}
    
  2. 상속을 진행했을 때
                  Employee
                     |
     Manager      Engineer       Secretary
     
   Employee타입으로 이기종간의 서브클래스들을 단일하게 관리할 수 있다
   
   step3. 
    >>> 추가 관련된 기능 ..C 
    public void addEmployee(Manager m){//}
    public void addEmployee(Engineer m){//}
    public void addEmployee(Secretary m){//}
    
    step4.
    >>> 추가 관련된 기능 ..C.. Polymorphic Argument!!!!
    public void addEmployee(Employee[] emps){
    	if(e instanceof Manager) {
    	   //
    	} else if (e instanceof Manager) {
    	   //
    	} else { 
    	   //
    	}
    
   
 */
//Polymorphic Argument 에 대한 기능적인 이해!!
public class EmployeeService {
	//1. 모든 직원의 정보를 출력하는 기능.. 일단 선언부만 작성 / 구현부는 나중에
	public void printAllEmployee(Employee[] emps) {
		for(Employee e : emps)
			System.out.println(e);
	}
	
	//2. 모든 직원중 특정한 직원을 검색하는 기능을 정의
	// find~~, search~~
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
	
	//3. 모든 직원중에서 동일한 부서에서 일하는 직원들을 검색
	// 일종의 오버로딩 기법 : 이름은 조금 다르지만 인자값이 같아서 좀 더 이름을 세부화시킨다
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
	
	//4. 특정한 직원의 연봉을 리턴하는 기능
	public double getAnnualSalary(Employee e) {
		double annualSalary = 0;
		annualSalary += e.getSalary()*12;
		if(e instanceof Engineer) {
			annualSalary += e.getSalary()*12 +((Engineer) e).getBonus();
		} 
		return annualSalary;
	}
	
	
	//5. 모든 직원의 총 인건비를 리턴 
	public double getTotalCost(Employee[] ea) {
		double total = 0;
		for(Employee e : ea) {
			total += getAnnualSalary(e);
		}
		return total;
	}
}










