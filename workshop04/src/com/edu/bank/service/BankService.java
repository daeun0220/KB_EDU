package com.edu.bank.service;

import com.edu.bank.Customer;

public class BankService {
	public static final int MAX_CUSTOMERS = 100;
	public Customer[] customers;
	public int numberOfCustomers;
	
	public BankService() {
		customers =new Customer[MAX_CUSTOMERS];
		numberOfCustomers = 0;
	}
	
	public void addCustomer(String name, int rrn, int zipCode, String region, String city) {
		if(numberOfCustomers ==  MAX_CUSTOMERS) {
			System.out.println("더이상 회원을 등록할 수 없습니다..");
			return;
		}
		customers[numberOfCustomers++] =  new Customer(name, rrn, zipCode, region, city);
	}
	
	public Customer getCustomer(int rrn) {
		for(int i=0; i<numberOfCustomers; i++) {
			if(customers[i].getRrn() == rrn) {
				return customers[i];
			}
		}
		
		return new Customer();
	}
	
	public void showAll() {
		if(numberOfCustomers == 0) {
			System.out.println("회원이 아무도 없습니다.");
			return;
		}
		for(int i=0; i<numberOfCustomers; i++) {
			System.out.println(customers[i]);
		}
	}
	
	// 고객 삭제 
	public void deleteCustomer(int rrn) {
		for(int i=0; i<numberOfCustomers; i++) {
			if(customers[i].getRrn() == rrn) {
				customers[i] = null;
			}
		}
	}
	// 계좌 내 balance로 고객 정렬
	public void sortCustomerbyAccount(int rrn) {
		
	}
	// 고객 주민등록번호로 고객 정렬
	public void sortCustomerbyRrn(int rrn) {
		
	}
}







