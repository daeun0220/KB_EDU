package com.edu.work;

public class ZigZagTest2 {

	public static void main(String[] args) {
		int [][] intArray = 
			{ 
			  { 1, 2, 3, 4, 5 },
			  { 6, 7, 8, 9,10 },
			  {11,12,13,14,15 },
			  {16,17,18,19,20 },
			} ;
		
		// #2 
		// | ^ | ^
		// | | | |
		// | | | |
		// V | V |
		
	// 코드 구현
		for(int i = 0; i < intArray[0].length; i++) {
			System.out.println(" ");
			if(i == 0 | i == 3 | i == 5) {
				for(int j = 0; j < intArray.length; j++) {
					System.out.print(intArray[j][i] + " ");
				}
			} else {
				for(int j = intArray.length - 1; j >= 0; j--) {
					System.out.print(intArray[j][i] + " ");
				}
			}
			
		}
		
	}
}
