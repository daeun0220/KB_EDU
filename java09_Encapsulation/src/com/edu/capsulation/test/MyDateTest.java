package com.edu.capsulation.test;

import java.util.Scanner;

import com.edu.capsulation.MyDate;
/*
 * 1. Scanner 사용해서 month, day 값 받아온다
 * 2. 마지막 출력결과에 절대로 0월 13일입니다/ 7월 0일입니다 / 0월 0일 입니다
 */

public class MyDateTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MyDate md = new MyDate(); //calling
		/*
		 * 다른 클래스에서 field에 직접적으로 접근을 못하게 함
		 * invalid 한 값이 필드에 저장되지 못하게 막아야 한다 
		 */
		//md.month = 33;
		//md.day = 33;
		
		//md.setMonth(33);
		//md.setDay(13);
		
		md.setMonth(sc.nextInt());
		md.setDay(sc.nextInt());
		
		//if(md.getMonth() != 0 & md.getDay() != 0) 
		System.out.println("오늘은 " + md.getMonth() + "월 " + md.getDay() + "일 입니다" );
		

	}

}
