package day01.array;

import java.util.HashMap;
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
		for(int i = 0; i < dna.length(); i++) {
			// " " 는 String ' ' 는 char 
			if(dna.charAt(i) == 'A') {
				codes[0] += 1;
			} else if(dna.charAt(i) == 'C') {
				codes[1] += 1;
			} else if(dna.charAt(i) == 'G') {
				codes[2] += 1;
			} else if(dna.charAt(i) == 'T') {
				codes[3] += 1;
			}
		}
		int[] cal = new int[4];
		for(int i = 0; i < 4; i++) {
			if(codes[i] < arr[i]) {
				System.out.println(0);
				break;
			} else {
				if(arr[i] > 0) {
					codes[i] -= arr[i];
					cal[i] += arr[i];
					p -= arr[i];
				} 
			}
		}
		
	}

}
