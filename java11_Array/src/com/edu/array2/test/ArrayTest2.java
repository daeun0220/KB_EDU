package com.edu.array2.test;

public class ArrayTest2 {

	public static void main(String[] args) {
		int[] member = {1,2,3,4,5};
		member = new int[8];   // 배열은 resize가 안됨. 새로운 객체 생성되는 것임
		member[5] = 6;
		member[6] = 7;
		member[7] = 8;
		
		
		for(int i : member) System.out.println(i);

	}

}
