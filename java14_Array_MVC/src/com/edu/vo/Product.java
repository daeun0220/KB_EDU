package com.edu.vo;
//정보를 저장하는 클래스...vo
public class Product {
	private String maker;
	private int price;
	private int quantity;
	private String company;
	
	// 생성자는 필드의 통로 
	public Product(String maker, int price, int quantity, String company) {
		super();
		this.maker = maker;
		this.price = price;
		this.quantity = quantity;
		this.company = company;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Product [maker=" + maker + ", price=" + price + ", quantity=" + quantity + ", company=" + company + "]";
	}
	
	
	
	

}
