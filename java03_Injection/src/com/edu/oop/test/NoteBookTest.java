package com.edu.oop.test;

import com.edu.oop.NoteBook;


public class NoteBookTest { // Client에 해당

	public static void main(String[] args) { // 첫 번째 실행라인
		NoteBook nb = new NoteBook();
		
		// 1. 값 주입되는 함수를 호출
		nb.setNoteBook("LG GRAM", 170, 123); //nb NoteBook 클래스에 있는 setNoteBook 호출
		
		// 2. 값을 반환하는 함수를 호출
		System.out.println(nb.getNoteBookInfo());
	}
	

}