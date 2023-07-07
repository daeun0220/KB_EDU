package com.edu.bank.test;

import com.edu.bank.Account;
import com.edu.bank.Customer;

public class BankTest1 {

	public static void main(String[] args) {
		/*
		 1. Account타입의 배열을 생성
		    111, 국민은행, 12만원
		    222, 신한은행, 340만원
		    333, 하나은행, 9만원
		 2. 김국민 이라는 고객이 1번에서 생성된 배열을 가짐
		    김국민에게 국민은행, 신한은행, 하나은행 통장을 개설..
		 3. 반복문을 사용해서 김국민이 개설한 통장의 정보를 출력 
		 */
		//1
		Account acc1 = new Account(111, "국민은행", 12);
		Account acc2 = new Account(222, "신한은행", 340);
		Account acc3 = new Account(333, "하나은행", 9);
		Account[] accounts = {acc1, acc2, acc3};
		
		//2
		Customer custom = new Customer(123, "김국민");
		custom.setAccounts(accounts);
		
		//3
		Account[] accs = custom.getAccounts();  // 직접적으로 가져오지말고 get, set 사용 ! 
		for(Account acc : accs) {  // 배열에는 같은 타입만 들어갈 수 있다 !! 
			System.out.println(acc);  // 가능한 이유 : toString 이 생략되어서 / toString 오버라이딩해서 바꿔둠 
		}
		
		System.out.println("===========================");
		
		/*1. 김국민이 개설한 통장중 국민은행 통장을 찾아서 해당 통장의 잔액 출금  -->  test 말고 기능에서 해결해야한다 
		 * 
		 * 2. 김국민이 개설한 통장의 모든 잔액 총합 출력
		 * 
		 * 3. 김국민이 개설한 통장 중 가장 많은 잔액이 들어있는 통장의 이름과 해당 잔액을 출금
		 */
		
		//1.
		for(Account ac : accs) {
			if(ac.getBankName().equals("국민은행")) {
				System.out.println(ac.getBalance());
			}
		}
		//2.
		double totalBalance = 0;
		for(Account ac : accs) {
			totalBalance += ac.getBalance();
			System.out.println(totalBalance);
		}
		//3.
		double maxBalance = 0;
		for(Account ac : accs) {
			maxBalance = Math.max(ac.getBalance(), maxBalance);
		}
		for(Account ac : accs) {
			if(ac.getBalance() == maxBalance) {
				System.out.println("통장이름 : " + ac.getBankName() + " 통장잔고 : " + ac.getBalance());
				
			}
		}
		
		 

	}

}
