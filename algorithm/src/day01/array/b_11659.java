package day01.array;

import java.util.Scanner;
// 시간복잡도 문제.... --> 누적합 구하기! 
public class b_11659 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 1; i < n; i++) {
			arr[i] += arr[i-1];
		}
		for(int k = 0; k < m; k++) {
			int i = sc.nextInt(); int j = sc.nextInt();
			if(i == 1) {
				System.out.println(arr[j-1]);
			} else {
				System.out.println(arr[j-1] - arr[i-2]);
			}
			
		}

	}

}
