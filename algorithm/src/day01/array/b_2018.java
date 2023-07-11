package day01.array;

import java.util.Scanner;

// 투포인터 문제 
public class b_2018 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int start = 1; int end = 1; 
		int hap = 1; int cnt = 0;
		while(start <= end) {
			if(hap == n) {
				cnt += 1;
			}
			if(hap > n) {
				hap -= start;
				start++;
			} else if(hap <= n) {   //  <= 해야지 while문 계속 안도는 이유 : 안그러면 같을 때 end++ 가 되지않아 start <= end 유지될 수 있어서
				end++;
				hap += end;
			}
		}
		
		System.out.println(cnt);
	}
}
