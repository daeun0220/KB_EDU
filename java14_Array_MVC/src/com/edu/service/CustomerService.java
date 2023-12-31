package com.edu.service;

import com.edu.vo.Customer;
import com.edu.vo.Product;

/*
 * 아울렛에서 상품을 구매하는 고객에 대한 기능을 다루는 서비스 클래스
 * 기능들만 정의되어져 있다
 * 하나의 기능은 독자적인 완벽한 서비스로 이해하자 
 */
public class CustomerService {
	//1. 특정 고객이 구입한 상품을 리턴하는 기능
	public Product[] getProducts(Customer c) {
		return c.getProducts();
	}
	
	//2. 특정고객이 구입한 상품들의 maker들만 리턴
	public String[] getAllProductMaker(Customer c) {
		String[] temp = new String[c.getProducts().length];
		int idx = 0;
		for(Product p : c.getProducts()) {
			temp[idx++] = p.getMaker();
		}
		return temp;
	}
	
	//3.  모든 고객중에서 특정한 고객을 검색 // 검색류는 find 나 search 
	public Customer findCustomerBySsn(Customer[] custs, int ssn ) {
		Customer customer = null;
		for(Customer c : custs) {
			if(c.getSsn() == ssn) {
				customer = c;   // return할 경우 if문에 해당 안될때 return 값도 줘야한다
			}
		} 
		return customer;
	}
	/*
	 * 메서드 오버라이딩 ::
	 * 하나의 클래스에서 하는 일은 같지만 처리하는 데이터를 다르게 할 때 처리하는 기법 
	 * 소스코드의 가독력을 높인다 
	 * 1. 메소드 이름은 일치 
	 * 2. 인자값은 한 개 이상 달라야한다
	 * 3. 리턴값은 상관없다 (같던지 말던지)  
	 */
	//4. 모든 고객중에서 특정한 동네에 사는 고객을 검색 
	public Customer[] findCustomerByAddr(Customer[] custs, String address ) {
		Customer[] temp = new Customer[custs.length];
		int idx = 0;
		for(Customer c : custs) {
			if(c.getAddress().equals(address)) {
				temp[idx++] = c;
			}
		}
		return temp;
	}

}
