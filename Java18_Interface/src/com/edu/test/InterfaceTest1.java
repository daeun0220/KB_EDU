package com.edu.test;

//추상메소드들의 집합(구현부가 없고 선언부만으로 이뤄진 메소드) 들의 집합
interface Flyer{
	void fly();  // 무조건 앞에 public abstract 가 붙는다
	void land();
	void takeOff();
}

class Bird implements Flyer {  //
	@Override
	public void fly() {
		System.out.println("Bird fly...");
	}  
	@Override
	public void land() {
		System.out.println("Bird land...");
	}
	@Override
	public void takeOff() {
		System.out.println("Bird takeoff...");
	}
	public String layEggs() {
		return "새가 알을 낳는다";
	}
	
}

class SuperMan implements Flyer {  //
	@Override
	public void fly() {
		System.out.println("SuperMan fly...");
	}  
	@Override
	public void land() {
		System.out.println("SuperMan land...");
	}
	@Override
	public void takeOff() {
		System.out.println("SuperMan takeOff...");
	}
	public String stopBullet() {
		return "망토로 총알을 막는다";
	}
	
}
public class InterfaceTest1 {

	public static void main(String[] args) {
		
		// 추상메서드가 있는 것으로는 객체 생성이 불가하다
		//Flyer f = new Flyer();
		
		Flyer b = new Bird(); // 인터페이스는 객체생성시 타입으로 존재한다(부모라서) 
		Flyer s = new SuperMan();
		
		
		b.fly();
		s.fly();
		
		System.out.println(((Bird) b).layEggs());
	}

}






