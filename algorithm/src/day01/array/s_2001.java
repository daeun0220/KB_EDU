package day01.array;

import java.util.Scanner;

class s_2001
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			//sb.append("#").append(br.readLine()).append(" "); //확인
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[][] arr = new int[n][n];
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			int maxHap = 0;
			for(int i = 0; i < n; i++) {
				for(int j =0; j < n; j++) {
					int hap = 0;
					for(int x = 0; x < m; x++) {
						for(int y = 0; y < m; y++) {
							if(i+m > n | j+m > n) {
								continue;
							} else {
								hap += arr[i+x][j+y];
							}
						}
					}
					maxHap = Math.max(maxHap, hap);
				}
			}
			System.out.printf("#%d %d", test_case, maxHap);
			System.out.println();
		
			/////////////////////////////////////////////////////////////////////////////////////////////
			/*
				 이 부분에 여러분의 알고리즘 구현이 들어갑니다.
			 */
			/////////////////////////////////////////////////////////////////////////////////////////////

		}
	}
}
