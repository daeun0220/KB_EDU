package com.edu.cons.test;

class Date{
	int year;
	int month;
	int day;
	
	
	public Date(int year, int month, int day) {
		// 필드 초기화...주입의 통로를 생성자로 결정
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public String getDate() {
		return year+"-"+month+"-"+day;
	}
}

class WhiteBoard{

	String madeCompany;
	float price;
	boolean scratch;
	char size;

	Date madeDate;
	

	public void setWhiteBoard(String madeCompany, float price, boolean scratch, char size, Date madeDate) {
		

		this.madeCompany = madeCompany;
		this.price = price;
		this.scratch = scratch;
		this.size = size;
		this.madeDate = madeDate;
	}
	

	public String getWhiteBoard() {
		return madeCompany +", "+price+", "+scratch+", "+size+", "+madeDate.getDate();
	}
}
public class WhiteBoardTest {

	public static void main(String[] args) {

		WhiteBoard wb = new WhiteBoard();

		wb.setWhiteBoard("동신사", 34000.0F, false, 'L', new Date(2023, 07, 04));
		

		System.out.println(wb.getWhiteBoard());

	}

}