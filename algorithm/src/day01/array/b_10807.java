package day01.array;

import java.util.Scanner;
// 백준 제출용은 Main.java로 
public class b_10807 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {  // 배열 input 받기 
			arr[i] = sc.nextInt();
		}
		int v = sc.nextInt();
		int cnt = 0;
		for(int i : arr) {
			if (i == v) {
				cnt += 1;
			}
		}
		System.out.println(cnt);
		
	}

}
