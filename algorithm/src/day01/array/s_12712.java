package day01.array;

import java.util.Scanner;

public class s_12712 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[][] arr = new int[n][n];
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			int[] dx1 = {1,-1,0,0}; int[] dy1 = {0,0,1,-1};
			int[] dx2 = {1,1,-1,-1}; int[] dy2 = {1,-1,1,-1};
			int maxHap = 0; int answer = 0;
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					int hap1 = arr[i][j]; int hap2 = arr[i][j];
					for(int k = 0; k < 4; k++) {
						for(int l = 1; l < m; l++) {
							int nx1 = i + dx1[k]*l; int ny1 = j + dy1[k]*l;
							int nx2 = i + dx2[k]*l; int ny2 = j + dy2[k]*l;
							if(nx1 >= 0 & nx1 < n & ny1 >= 0 & ny1 < n) {
								hap1 += arr[nx1][ny1];
							}
							if(nx2 >= 0 & nx2 < n & ny2 >= 0 & ny2 < n) {
								hap2 += arr[nx2][ny2];
							}
						}
					}
					maxHap = Math.max(hap1, hap2);
					answer = Math.max(maxHap, answer);
				}
			}
			System.out.printf("#%d %d", test_case, answer);
			System.out.println();
		}

	}

}
