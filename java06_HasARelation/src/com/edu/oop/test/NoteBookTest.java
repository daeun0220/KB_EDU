package com.edu.oop.test;

import com.edu.oop.NoteBook;

public class NoteBookTest {

	public static void main(String[] args) {
		/*
		 * 1. 객체 생성 == class의 멤버를 메모리에 올린다.
		 * 2. 멤버에 접근
		 * 	필드 --> 값할당
		 * 	메소드 --> 호출
		 */
	// 생성되는 객체의 Type         // 필드 초기화
		NoteBook nb1 = new NoteBook("LG Gram", 170, 12);
		nb1.brand = "HP";
		System.out.println(nb1.getNoteBookInfo());
		
		// 처음에 에러가 나는 이유? 기본생성자에 대한 정의가 되어 있지 않아서
		// NoteBook class에서 기본생성자를 정의하고 오면 해결
		NoteBook nb2 = new NoteBook(); // 기본생성자
	}

}
