package com.edu.collection.test;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class HashMapTest1 {

	public static void main(String[] args) {
		HashMap<String, Integer>map = new HashMap<>();
		map.put("아이유", 90);
		map.put("박나래", 80);
		map.put("미미", 78);
		map.put("제임스", 85);
		
		System.out.println(map.toString());
		//1. map 안에 있는 사람들의 이름들만 받아옴 
		Set<String> set = map.keySet();   //keySet은 Set에 담기기때문에 Set 변수 잡아주는 것이 중요하다
		System.out.println(set);
		
		//2. 이름에 해당하는 성적들을 출력
		for(String name : set) System.out.println(map.get(name)); // 담긴 키값에서 get() value 가져온다
		
		//3. map 에 있는 사람들의 성적들만 받아옴
		Collection<Integer> scores = map.values();
		System.out.println(scores);
		
		//4. 사람들의 성적의 평균과 최고성적을 구해서 출력
		int sum = 0; int maxScore = 0;
		for(String name : set) {
			sum += map.get(name);
			maxScore = Math.max(maxScore, map.get(name));
		}
		System.out.println("평균 성적 : " + sum/set.size());
		System.out.println("최고 성적 : " + maxScore);
		System.out.println("최고 성적 : " + Collections.max(scores));  // Collections. ****
		System.out.println("최저 성적 : " + Collections.min(scores));
	}

}
