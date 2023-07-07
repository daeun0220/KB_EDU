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
	
	

}
