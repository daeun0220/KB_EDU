package day01.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class s_1210 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		for(int t = 0; t < 10; t++) {
			sb.append("#").append(bf.readLine()).append(" ");
			
			int[][] arr = new int[100][100];
			int x = 99; int y = 0;
			
			for(int i = 0; i < 100; i++) {
				st = new StringTokenizer(bf.readLine());
				for(int j = 0; j < 100; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
					if(arr[99][j] == 2) y = j;
				}
			}
			
			int nx, ny;
			int[] dx = {0, 0, -1};
			int[] dy = {-1, 1, 0};
			while(x != 0) {
				for(int k = 0; k < 3; k++) {
					nx = x + dx[k];
					ny = y + dy[k];
					if(nx < 0 || nx >= 100 || ny < 0 || ny >= 100 || arr[nx][ny] == 0) continue;
					x = nx; y = ny;
					arr[nx][ny] = 0;
				}
			}
			sb.append(x).append("\n");
		}
		System.out.println(sb);
	}

}
