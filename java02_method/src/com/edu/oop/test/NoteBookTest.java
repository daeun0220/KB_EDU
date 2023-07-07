package com.edu.oop.test;

import com.edu.oop.NoteBook;
/*
 * 문제점
 * 필드에 일일이 값할당(초기화) 하고있다
 * 필드의 개수가 늘어나면 코드라인도 늘어나고 가독력도 떨어진다
 * 
 * 해결책
 * 
 */

public class NoteBookTest {

	public static void main(String[] args) {
		NoteBook nb = new NoteBook();
		
		nb.brand = "아이스크림";
		nb.price = 10;
		nb.serialNumber = 1;
		
		nb.printNoteBookInfo();

	}

}
