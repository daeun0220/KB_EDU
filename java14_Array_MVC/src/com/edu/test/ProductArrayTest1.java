package com.edu.test;

import com.edu.vo.Product;

public class ProductArrayTest1 {

	public static void main(String[] args) {
		// 객체 생성 함수 호출
		Product[] products = {
				new Product("신라면", 1200, 10, "농심"),
				new Product("삼다수", 1100, 2, "농심"),
				new Product("옥시크린", 34000, 1, "엘지"),
				new Product("iphone", 1000000, 1, "애플")
		};
		
		System.out.println("=== 1. 상품들의 Maker 만 출력합니다 ===");
		
		for(Product p : products) {
			System.out.println(p.getMaker());
		}
		
		
		System.out.println("=== 2. 10만원 이상의 고가제품 정보 출력합니다 ===");
		
		for(Product p : products) {
			if(p.getPrice() >= 100000) {
				System.out.println(p);
			}
		}
		
		System.out.println("=== 3. 구매한 상품의 총 합을 출력합니다 ===");
		int totalPrice = 0;
		for(Product p : products) {
			totalPrice += p.getPrice();
		} System.out.println(totalPrice);

	}

}
