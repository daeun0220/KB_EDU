package com.edu.test;

import java.util.Scanner;

/*
 Test3의 문제점을 해결해보자
 nextLine() 사용한채로 --> sc.nextLine(); 사용 
 */
public class ScannerTest4 {

	public static void main(String[] args) {
		// 1. 키보드로 입력되는 값을 받아오는 Scanner 생성
		Scanner sc = new Scanner(System.in);
		// 2. 정수값을 입력받는 기능
		System.out.println("값 입력>>>");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		sc.nextLine();   // 한줄 띄어준다 
		String name = sc.nextLine();
		
		//System.out.println("num1 : " + num1 + " num2 : " + num2);
		System.out.printf("num1 : %d num2 : %d ", num1, num2);
		System.out.println("name : " + name);

	}

}
