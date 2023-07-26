package com.edu.test;
// 사용자 정의 예외
class ZeroBoom extends Exception{
	ZeroBoom(){
	   this("This is ZeroBoom Exception");
	}
	ZeroBoom(String message) {
		super(message);
	}
	
}
class User {
	public void go() throws ZeroBoom{
		int i = 10;
		int j = 0;
		
		System.out.println("2. go()...진입...");
		//밑에 어느 부분에서 연산진행...i/j 에서 j에 0값이 할당되면 안됨..
		//만약에 j가 0이라면 Exception을 발생시킬것이다
		if(j == 0) throw new ZeroBoom("분모가 0이면 안됩니다"); //사용자 정의 예외 
		
		System.out.println("ArithmeticException 터짐");   // 출력안됨!
	}
}
public class UserException4 {

	public static void main(String[] args) {
		User user = new User();
		System.out.println("1. go()...호출...");
		try {
			user.go();
		} catch(ZeroBoom e) {
			System.out.println(e.getMessage());
			//System.out.println("3. 폭탄처리했음");
		}


	}

}
