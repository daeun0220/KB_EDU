package com.edu.domain;

public class NoteBook {

	public String brand;
	public int price;
	public int serialNumber;
	/*
	 * this 
	 * 로컬변수와 필드를 구분하기 위한 키워드로 
	 * 핑드 앞에 붙여준다
	 * ::
	 * this 키워드는 자기자신을 참조하는 주소값을 가지고 있다
	 */
	public NoteBook(String brand, int price, int serialNumber) {  //괄호 안 변수 = 로컬변수(지역변수)
		this.brand = brand;
		this.price = price;
		this.serialNumber = serialNumber;
	}
	
	//기본 생성자 추가
	// 하나의 클래스에서는 반드시 하나이상의 생성자가 존재한다
	// 명시적 생성자가 정의되어져 있지 않을 때 무조건 기본 생성자를 넣어준다 컴파일러가 
	// 만약에 명시적 생성자가 정의되어져 있으면 그때는 자동으로 기본생성자 넣어주지 X 
	public NoteBook() {
		
	}

//	public String getNoteBookInfo() {
//		return brand+
//			   "\t"+price+
//			   "\t"+serialNumber;
//	}
	
	@Override
	public String toString() {
		return brand+
				   "\t"+price+
				   "\t"+serialNumber;
	}

}
