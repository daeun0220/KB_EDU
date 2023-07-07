package com.edu.array3.test;

public class TwoDimArrayTest {
	public static void main(String[] args) {
		int[][] twoArr = new int[2][3];  //2행3열 이중배열 
		System.out.println(twoArr.length);
		System.out.println(twoArr[0].length);
		System.out.println(twoArr[1].length);
		
		
		for(int i = 0; i < twoArr.length; i++) {
			for(int j = 0; j <twoArr[i].length; j++) {
				System.out.println(twoArr[i][j] + " ");
			}
			System.out.println("");
		}
		
		System.out.println("==========================");
		int[][] twoArr2 = new int[2][];  // 몇행일지 나중에 정한다
		System.out.println(twoArr2.length);
		System.out.println(twoArr2[0].length);
		
		twoArr2[0] = new int[3];
		twoArr2[1] = new int[6];
		System.out.println(twoArr2[0].length);
		System.out.println(twoArr2[1].length);
	}

}
