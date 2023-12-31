package com.edu.condition.test;

import java.util.Scanner;

/*
 Scanner 를 사용해서 성적과 함께 과목명을 입력
 Java, A Grade ...
 */
public class GradeIfTest2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("성적입력 >> ");
		
		String classname = sc.next();
		int grade = sc.nextInt();
		
		if(grade <= 100 & grade > 80) 
			System.out.println(classname + " : A Grade");
		else if (grade <= 80 & grade > 70)
			System.out.println(classname + " : B Grade");
		else if (grade <= 70 & grade > 60)
			System.out.println(classname + " : C Grade");
		else
			System.out.println("Try Again");
		

	}

}
