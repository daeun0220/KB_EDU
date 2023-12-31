package com.edu.capsulation;
/*
 * 오늘 날짜를 저장하는 클래스 
 * valid 값만 month, day에 할당되도록 제어문을 사용 
 * month 1~12 사이의 값만 필드 초기화 
 * day 
 * 1,3,5,7,8,10,12월 day 1~31일
 * 4,6,9,11월        day
 * 2월               day 1~28일
 * 
 * Encapsulation 작성 패턴
 * 1. field 앞 -- private
 * 2. method(setter / getter) 앞 -- public
 * 3. setter 메소드 필드초기화 하기 직전에
 *    타당한 값만 필드에 저장되도록 문장을 제어한다
 */
public class MyDate {
	// private : 같은 클래스에서만 접근을 허용
	private int month;
	private int day;
	
	//public MyDate() {}
	

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		// 제어문 적용
		if(month >= 1 & month <= 12) {
			this.month = month;
		}
		//else
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {  // switch문으로 ! 많은건 default 으로 돌리는 것도 좋은 방법...
		/*
		if(month == 1 | month == 3 | month == 5 | month == 7 | month == 8 | month == 10 | month == 12 ) {
			if( day >= 1 & day <= 31) {
				this.day = day;
			}
		}
		else if(month == 4 | month == 6 | month == 9 | month == 11 ) {
			if( day >= 1 & day <= 30) {
				this.day = day;
			}
		}
		else if (month == 2) {
			if (day >= 1 & day <= 28) {
				this.day = day;
			}
		}
		*/
		
		switch(month) {
		case 2 :
			if (day >= 1 & day <= 28) {
				this.day = day;
			} else {
				System.out.println("Invalid Day");
				System.exit(0);
			}
		case 4 :
		case 6 :
		case 9 :
		case 11 :
			if (day >= 1 & day <= 30) {
				this.day = day;
			} else {
				System.out.println("Invalid Day");
				System.exit(0);
			}
		default :
			if (day >= 1 & day <= 31) {
				this.day = day;
			} else {
				System.out.println("Invalid Day");
				System.exit(0);
			}
		break;
		}
	}
	
	

}
