package day01.array;

import java.util.Scanner;


class s_1954
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++) {
			int n = sc.nextInt();
			int[][] arr = new int[n][n];
			int[] dx = {0,1,0,-1}; int[] dy = {1,0,-1,0};
			int x = 0; int y = 0; 
			arr[0][0] = 1; 
			for(int i = 2; i <= n*n; i++) {
				for(int j = 0; j < 4; j++) {
					int nx = x + dx[j];
					int ny = y + dy[j];
					if(nx >= 0 & nx < n & ny >= 0 & ny < n) {
						if(arr[nx][ny] == 0) {
							arr[nx][ny] = i;
							x = nx; y = ny;
							break;
						}
				}
			}
		}
		System.out.printf("#%d", test_case);
		System.out.println();
		for(int i = 0; i < n; i++) {
			int[] inArr = arr[i];
			for(int j = 0; j < n; j++) {
				System.out.print(inArr[j] + " ");
			}
			System.out.println();
		}
	}
}
}
