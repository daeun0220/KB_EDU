package com.edu.service;

import com.edu.vo.Product;
// Product들을 관리하는 기능만으로 구성된 서비스 클래스
// 메소드 identifier / return type, 인자값
// 구현
// *** 메서드 한 개당 완전한 서비스 하나
public class ProductService {
	
	//1. 배열 안에 있는 모든 상품들의 메이커를 출력하는 기능  // 출력이니까 void , 모든이면 all이나 s(복수) 
	public void printAllProductMaker(Product[] pros) {
		for(Product p : pros) {
			System.out.println(p.getMaker());
		}
	}
	
	//2. 상품들의 총 구입액을 리턴하는 기능  // 총 금액은 total, 리턴하는거 get / 리턴값이 있을 경우 무조건 초기값 변수 잡고 (리턴값 만들고) 시작한다!!! 
	// private 은 해당 클래스 내에서만 사용 가능한 메서드라는 뜻 --> 해당 클래스에서 메서드 사용했을 수 있으니 확인..! 
	public int getTotalPrice(Product[] pros) {
		int totalPrice = 0;
		for(Product p : pros) {
			totalPrice += p.getPrice()*p.getQuantity();
		} 
		return totalPrice;
	}
	
	//3. 특정 금액 이상의 상품을 리턴하는 기능 // 이상이니까 over, more  // 상품을 리턴할 경우 maker, price .. 다 보내야하니까 [] 타입으로..!
	public Product[] getMorePrice(Product[] pros, int price) {
		Product[] temp = new Product[pros.length];
		
		int idx = 0; // for-each문 사용할 경우 인덱스가 없으니까 따로 변수로 지정해준다!!
		for(Product p : pros) {
			if(p.getPrice() >= price) {
				temp[idx++] = p;  // temp[idx] = p 넣고 idx++ 시켜주는 코드 
			}
		}
		return temp;
	}
	
	//4. 동일한 회사의 제품들만 리턴하는 기능
	public Product[] getCertainCompany(Product[] pros, String company) {
		Product[] temp = new Product[pros.length];
		
		int idx = 0;
		for(Product p : pros) {
			if(p.getCompany().equals(company)) {  // String 비교할 땐 equals() 사용
				temp[idx++] = p;
			}
		}
		return temp;
	}
	
	
	//5. 구입한 상품들의 평균가격을 리턴하는 기능    // 이미 만들어진 메서드에서 재사용할 수 있다 !
	public int getAvgPrice(Product[] pros) {
		return getTotalPrice(pros)/pros.length;
	}

}
