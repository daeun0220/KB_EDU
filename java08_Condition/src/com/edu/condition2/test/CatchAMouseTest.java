package com.edu.condition2.test;

import java.util.Scanner;

/*
 * 간단한 알고리즘을 푸는 테스트 코드의 구조
 */
public class CatchAMouseTest {
	
	public static String solve(int x, int y, int z) {
		if(Math.abs(x-z) > Math.abs(y-z)) {
			return "Cat B Catch!";
		}
		else if(Math.abs(x-z) < Math.abs(y-z)) {
			return "Cat A Catch!";
		}
		else {
			return "Mouse Escapes!";
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//CatchAMouseTest t = new CatchAMouseTest();   객체생성 안해도 호출 가능하게 하려면 --> static 
		//순서대로 정수값을 입력받자
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		//입력받은 값들을 가지고 알고리즘을 해결해야 한다
		//메소드 안에서 알고리즘을 해결할것이다
		String result = solve(a,b,c); 
		System.out.printf("Result :: %s", result);
		
		
	}

}
