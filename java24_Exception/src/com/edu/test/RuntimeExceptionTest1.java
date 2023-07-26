package com.edu.test;
/*
 * 컴파일시에는 에러가 없는데
 * 실행시점에서 에러가 발생..
 * 컴파일러가 인지하지 못함 
 * 
 * 명시적인 예외 처리하지 않고
 * 바로 코드를 수정하면 정상처리됨 
 * ::
 * SQLException 
 * 
 * 명시적 예외처리 방법
 * try, catch, finally, throws, throw 
 * 
 * try{
 * 	//예외 발생 가능 코드 
 * }catch(ArrayIndexOutOfBoundsException e) {
 *	//예외 발생하면 이곳으로 코드가 이동... 여기서 예외 잡혔을때 코드
 *} catch(Exception e) {
 *	//다른 에러도 잡을 수 있음
 *} finally {
 *  //예외 발생하건, 안하건 무조건 작성해야하는 코드 
 *}
 */
public class RuntimeExceptionTest1 {

	public static void main(String[] args) {
		String[] str = { "Hello", "No I mean it", "Nice to meet you"};
		int i = 0;
		
		while(i<=3) {
			try {
				System.out.println(str[i]);
			}catch(ArrayIndexOutOfBoundsException e) {  // 여러번 잡을 수 있는데 코드는 처음 잡힌것만 돌아간다
				System.out.println("Nice Catch1~~");
			}catch(ArithmeticException e) {
				System.out.println("Nice Catch2~~");
			}catch(Exception e) {
				System.out.println("Nice Catch3~~");
			}finally {
				System.out.println("Always");
			}
			i++;
		}
		

	}

}
