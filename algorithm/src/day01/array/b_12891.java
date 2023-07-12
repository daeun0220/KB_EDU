package day01.array;

import java.util.Scanner;

public class b_12891 {
// 슬라이딩 윈도우 : 투포인터와 비슷하다. start와 end 간격이 일정하다는 특징이 있다
// 일정한 크기(값)을 유지할 때 사용한다 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt(); int p = sc.nextInt();
		String dna = sc.next();
		int a = sc.nextInt(); int b = sc.nextInt(); int c = sc.nextInt(); int d = sc.nextInt();
		int[] codes = new int[4];
		int[] arr = {a, b, c, d};
		int cnt = 0;
		for(int i = 0; i < p; i++) {  // 처음 부분문자열 잡기..!
			// " " 는 String ' ' 는 char 
			if(dna.charAt(i) == 'A') codes[0]++;
			if(dna.charAt(i) == 'C') codes[1]++;
			if(dna.charAt(i) == 'G') codes[2]++;
			if(dna.charAt(i) == 'T') codes[3]++;
		}
		
		if(checkCounting(codes, arr)) cnt++;
		// 부분문자열 만들기 
		int i = -1;
		for(int j = p; j < s; j++) {
			i = j - p; 
			
			if(dna.charAt(i) == 'A') codes[0]--;
			if(dna.charAt(i) == 'C') codes[1]--;
			if(dna.charAt(i) == 'G') codes[2]--;
			if(dna.charAt(i) == 'T') codes[3]--;
			
			if(dna.charAt(j) == 'A') codes[0]++;
			if(dna.charAt(j) == 'C') codes[1]++;
			if(dna.charAt(j) == 'G') codes[2]++;
			if(dna.charAt(j) == 'T') codes[3]++;
			
			if(checkCounting(codes, arr)) cnt++;
		}
		System.out.println(cnt);
	}
	// 2번 이상 사용되는 로직일 경우 함수 만들기 (추천) 
	public static boolean checkCounting(int[] codes, int[] arr) {
		for(int i = 0; i < 4; i++) {
			if(codes[i] < arr[i]) {
				return false;
			}
		} return true;
	}

}
