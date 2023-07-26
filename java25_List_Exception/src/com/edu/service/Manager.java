package com.edu.service;

import java.util.ArrayList;
import java.util.DuplicateFormatFlagsException;

import com.edu.domain.Employee;
import com.edu.domain.Person;
import com.edu.domain.Student;
import com.edu.domain.Teacher;
import com.edu.exception.DuplicateSSNException;
import com.edu.exception.RecordNotFoundException;



public class Manager {
	/*private Person[ ] p;
	private int index;
	*/
	
	private ArrayList<Person> list;
	
	public Manager(int size){
		list = new ArrayList<>();
	}
	public void getPersons(){
		for(Person p : list) {
			System.out.println(p);
		}
	}	
	
	public void addPerson(Person person)throws DuplicateSSNException{		// 있으면 안됨 
		//추가하려는 사람이 없을때만 추가되도록 작성
//		if(!list.contains(person))
//			list.add(person);
		boolean find = false;
		for(Person p : list) {
			if(p.getSsn()==person.getSsn()) {
				find = true;
				throw new DuplicateSSNException("그런 사람 이미 있어요");
			}
		}
		if(find==false) {
			list.add(person);
			System.out.println(person.getName()+ "님 회원등록 성공! ");
		}
	}
	
	public void deletePerson(int ssn) throws RecordNotFoundException{
		//삭제하려는 대상이 있을때에만 삭제가 되도록 작성     // 없으면 안됨 
		boolean find = false;
		for(Person p : list) {
			if(ssn == p.getSsn()) {
				find = true;
				System.out.println(p.getName()+ "님 회원 탈퇴!");
				list.remove(p);
				break;
			}
		}
		if(find==false) {
			throw new RecordNotFoundException("그런 사람 없습니다");
		}
	}

	public Person findPerson(int ssn){     // 존재유무 파악할 필요 없다 
		Person person = null;     //리턴타입이 있을 때에는 미리 지정해둔다 
		for(Person p : list) {
			if(p.getSsn() == ssn) {
				person = p;
				break;
			}
		}
		return person;
	}

	public ArrayList<Person> findPerson(String addr){
		ArrayList<Person> people = new ArrayList<>();
		for(Person p : list) {
			if(p.getAddress().equals(addr)) {
				people.add(p);
			}
		}
		return people;
	}

	public void updatePerson(String name,int age, String addr, String str,int k){	
		//툭정한 위치에 있는 사람의 정보를 수정함
		//메소드의 인자값을 잘 활용해서 모든 객체의 정보가 수정될수 있도록 로직을 작성
		list.get(k).setName(name);
		list.get(k).setAddress(addr);
		list.get(k).setAge(age);
		if(list.get(k) instanceof Employee) ((Employee) list.get(k)).setDept(str);
		else if(list.get(k) instanceof Student) ((Student) list.get(k)).setStuId(str);
		else ((Teacher) list.get(k)).setSubject(str);
		
	}
}
