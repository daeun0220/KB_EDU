package com.edu.oop;
// NoteBook에 관련된 정보를 저장하는 클래스
// NoteBook 구성요소 = 필드 + 메소드
public class NoteBook {
	
	//필드 선언
	public String brand;
	public int price;
	public int serialNumber;   
	
	//메소드 정의 (선언부 + 구현부) 
	public void printNoteBookInfo() {
		System.out.println(brand + 
				           "\t" + price + 
				           "\t" + serialNumber);
	}
	
	//필드에 값할당하는 기능을 추가 == 주입(set~~)
	public void setNoteBook(String brand, int price, int serialNumber) {
		// 필드와 로컬변수를 구분하기 위해 this 키워드를 필드 앞에 붙여준다
		this.brand = brand;
		this.price = price;
		this.serialNumber = serialNumber;
		
	}
	
	

}
