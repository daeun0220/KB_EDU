package com.edu.sort.test;

import java.util.Arrays;
/*
 * Arrays.sort()를 사용할 수 있는 데이터타입들은
 * String, int, short, double ...
 * Date, File ... 이런것들은 다 가능하다 
 * 
 * 이유는 위 클래스들은 자체적으로 Comparable 인터페이스에 의해서
 * 구현이 되어져있어서 가능하다 
 * 
 * ArrayList같은 Collection API는 Arrays.sort() 사용 못한다
 * Comparable에 위에서 구현되어져 있지 않기 때문에
 * ArrayList는 Collection.sort()를 사용해야 한다 
 */
public class ComparableTest1 {

	public static void main(String[] args) {
		String[] names = {
				"Peter", "Tomas", "James", "Admas"
		};
		
		int[] numbers = {5, 17, 23, 2, 100, 7};
		
		Arrays.sort(names);
		Arrays.sort(numbers);
		


	}

}
