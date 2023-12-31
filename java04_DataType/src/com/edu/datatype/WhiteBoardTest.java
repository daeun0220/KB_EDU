package com.edu.datatype;
/*
 * 오전에 정리한 자바의 DataType을 이해할 수 있는 클래스 작성
 * 2개의 클래스를 한번에 작성할 때는
 * 1. main()를 가지고 있는 클래스 앞에만 public을 지정
 * 2. public으로 지정된 클래스명으로 java 파일이 저장되어야 한다
 */

class Date{
	int year;
	int month;
	int day;
	
	public void setDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	/*
	 * String + Non-String ==> String화
	 */
	public String getDate() {
		return year+"-"+month+"-"+day;
	}
}

class WhiteBoard{
	// 1. 필드 선언
	String madeCompany;
	float price;
	boolean scratch;
	char size;
	// 추가..제조일자
	Date madeDate;
	
	// 2. 피드 주입 기능 정의(void | 인자값)
	public void setWhiteBoard(String madeCompany, float price, boolean scratch, char size, Date madeDate) {
		
		// 필드 초기화
		this.madeCompany = madeCompany;
		this.price = price;
		this.scratch = scratch;
		this.size = size;
		this.madeDate = madeDate;
	}
	
	// 3. 주입된 필드값을 반환 (??? | 인자값X)
	public String getWhiteBoard() {
		return madeCompany +", "+price+", "+scratch+", "+size+", "+madeDate.getDate();
	}
}
public class WhiteBoardTest {

	public static void main(String[] args) {
		// 객체 생성...new...메모리에 로딩
		WhiteBoard wb = new WhiteBoard();
		
		Date madeDate = new Date();
		madeDate.setDate(2023, 07, 04);
		// 1. set~~() 호출...필드값이 채워진다
		// 인자값의 갯수, 순서, 타입이 일치해야 한다
		wb.setWhiteBoard("동신사", 34000.0F, false, 'L', madeDate);
		
		// 2. get~~() 호출...System.out.println()
		System.out.println(wb.getWhiteBoard());

	}

}
