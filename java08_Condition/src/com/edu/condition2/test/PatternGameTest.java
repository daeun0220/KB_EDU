package com.edu.condition2.test;

import java.util.Scanner;

public class PatternGameTest {
	
	public static String solve(int num) {
		if(num >= 10 & num <= 99) {
			String num1 = Integer.toString(num);
			String ans = "";
			for(int i = 0; i < num1.length(); i++) {
				int num2 = Character.getNumericValue(num1.charAt(i));
				if(num2 % 3 == 0) {
					ans = ans + "@"; 
				} else {
					ans = ans + num1.charAt(i);
				}
			}
			return ans;
		}
		else {
			return "Try Again";
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("값 입력 >> ");
		int n = sc.nextInt();
		
		
		System.out.println(solve(n));

	}

}
