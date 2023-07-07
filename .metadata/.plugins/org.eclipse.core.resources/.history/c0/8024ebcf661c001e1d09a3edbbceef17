package com.edu.bank;

public class Customer {
	public int ssn;
	public String custName;
	
	public Account account; //선언만으로 주입이 이뤄지진 않는다.

	public Customer(int ssn, String custName) {
		super();
		this.ssn = ssn;
		this.custName = custName;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Account getAccount() {
		return account;
	}
	
	public String getCustomerInfo() {
		return ssn+"-"+custName;
	}
	
}