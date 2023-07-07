package com.edu.oop;
// NoteBook에 대한 정보를 저장하는 클래스
public class NoteBook {
	public String brand;
	public int price;
	public int serialNumber;
	

	// 필드에 값 주입(값 할당) == 필드초기화
	public void setNoteBook(String brand, int price, int serialNumber) {
		this.brand = brand;
		this.price = price;
		this.serialNumber = serialNumber;
	
	}
	// 메서드는 return type을 가짐
	// return type이 void면 반환값이 없다는 의미의 return type
	// 반환값을 String으로 지정
	// ~Test클래스로(호출한 곳으로) 리턴.. 거기서 출력하면 된다
	public String getNoteBookInfo() {
		return brand+
				"\t"+price+
				"\t"+serialNumber;
	}	
}
