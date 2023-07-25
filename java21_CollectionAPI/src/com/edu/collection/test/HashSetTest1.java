package com.edu.collection.test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HashSetTest1 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();// 순서X, 중복X 
		set.add("탁재훈");
		set.add("이수근");
		set.add("김희철");
		set.add("탁재훈");
		set.add("서장훈");
		
		System.out.println(set);
		
		//1. set 에 저장된 데이터 개수 출력
		System.out.println(set.size());
		
		//2. 김준호 멤버가 저장되어있는지 여부
		if(set.contains("김준호")) System.out.println("있다");
		else System.out.println("없다");
		
		//3. 이수근을 삭제
		set.remove("이수근");
		System.out.println(set);
		
		//4. 모든 멤버 삭제
		set.removeAll(set);  
		//5. set이 비어져 있는지 확인
		if(set.isEmpty()) System.out.println("비었다");

	}

}
