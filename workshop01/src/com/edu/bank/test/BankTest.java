package com.edu.bank.test;

import com.edu.bank.Account;
import com.edu.bank.Customer;

public class BankTest {

	public static void main(String[] args) {
		Customer c1 = new Customer(111, "동은");
		Customer c2 = new Customer(222, "지수");
		
		//Customer와 Account의 Hasing 이 이뤄짐
		c1.setAccount(new Account(789, "국민은행", 10000));
		c2.setAccount(new Account(890, "국민은행", 30000));
		
		//각자의 고객이 개설한 통장을 받아서
		Account c1Acc=c1.getAccount();
		Account c2Acc=c2.getAccount();
		
		System.out.println("===다음은 문동은님의 입출금 내역====");
		c1Acc.deposit(23000.0);
		c1Acc.deposit(3000.0);
		c1Acc.withdraw(3000.0);
		
		System.out.println("잔액은 "+c1Acc.getBalance()+"원");
	}

}