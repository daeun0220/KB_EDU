package com.edu.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.edu.domain.Person;



public class Manager {
	private static Manager manager = new Manager(100); //1.

	private Map<Integer,Person> map;
	
	
	private Manager(int size){  //2. 생성자 앞에 private 
		System.out.println("싱글톤 패턴");
		map = new HashMap<>();
	}
	public static Manager getInstance() {  //3. static 필수
		return manager;
	}
 	public void printAllPersonInfo(){
		Set<Integer> set = map.keySet();
		for(int ssn : set) {
			System.out.println(ssn + "PersonInfo : " + map.get(ssn));
		}
		
	}	
	
	public void addPerson(Person person){		
		//추가하려는 사람이 있을떄는 추가되지 않도록 작성
		if(map.containsKey(person.getSsn())) {
			System.out.println(person.getName() + "님은 이미 회원입니다");
			return;
		} else {
			map.put(person.getSsn(), person);
			System.out.println(person.getName() + "님이 등록~~ ");
		}
		
		
	}
	
	public void deletePerson(int ssn){
		// 삭제 대상이있을때만 삭제되도록
		// containsKey()를 사용안하는 대신에 Person 리턴값을 활용하자
		Person p = map.remove(ssn);  // 삭제하고 삭제한 대상 p 에 저장한거!! 
		if(p == null) {
			System.out.println("삭제대상이 없습니다");
			return;
		} else {
			System.out.println(p.getName() + "님 삭제됨");
		}
	}
	
	public Person findPerson(int ssn){
//		Person person = null;
//		if(map.containsKey(ssn)) {
//			person = map.get(ssn);
//		}
//		return person;
		return map.get(ssn);  // 리턴타입 Person 이니까! 
	}//

	public ArrayList<Person> findPerson(String addr){
		ArrayList<Person> people = new ArrayList<>();
		Set<Integer> set = map.keySet();
		for(int key : set) {
			if(map.get(key).getAddress().equals(addr)) {
				people.add(map.get(key));
			}
		}
		return people;
	}
	// map 에는 set()가 별도로 존재하지 않고 key에 해당하는 값을 다시 put 한다
	public void updatePerson(Person p, int ssn){	
		if(map.containsKey(ssn)) {
			//map.replace(ssn, p);
			map.put(ssn, p);
			System.out.println("UPDATE OK");
		} else {
			System.out.println("UPDATE NO");
		}
		
		
	}
}











