package com.edu.work;
/*
 * 정수 10진수는 %d를 이용해서 표현한다
 * %3d  앞에 2개의 공간이 생긴다
 * %03d 앞에 00이 생긴다
 */
public class ZigZagTest1 {

	public static void main(String[] args) {
		int [][] intArray = 
			{ 
			  { 1, 2, 3, 4, 5 },
			  { 6, 7, 8, 9,10 },
			  {11,12,13,14,15 },
			  {16,17,18,19,20 },
			} ;
		
		// #1 
		// ---->
		// <----
		// ---->
		// <----
		
		for(int i = 0; i < intArray.length; i++) {
			System.out.println(" ");
				if(i == 0 | i == 2) {
					for(int j = 0; j < intArray[i].length; j++) {
						System.out.print(intArray[i][j] + " ");
					}
				} else {
					for(int j = intArray[i].length - 1; j >= 0; j--) {
						System.out.print(intArray[i][j] + " ");
					}
				}
		
		}

	}
	
}

