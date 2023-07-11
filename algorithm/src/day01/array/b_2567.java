package day01.array;

import java.util.Scanner;

public class b_2567 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] arr = new int[101][101];
		for(int t = 0; t < n; t++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			for(int i = x; i < x+10; i++) {
				for(int j = y; j < y+10; j++) {
					arr[i][j] = 1;
				}
			}
		}
		int[] dx = {0,0,1,-1};
		int[] dy = {1,-1,0,0};
		int hap = 0;
		for(int i = 1; i <= 100; i++) {
			for(int j = 1; j <= 100; j++) {
				if(arr[i][j] == 1) {
					for(int k = 0; k < 4; k++) {
						int nx = i + dx[k];
						int ny = j + dy[k];
						
						if(nx >= 0 & nx <= 100 & ny >= 0 & ny <= 100 & arr[nx][ny] == 0) {
							hap++;
						}
					}
				}
			}
		}
		System.out.println(hap);
	}

}
