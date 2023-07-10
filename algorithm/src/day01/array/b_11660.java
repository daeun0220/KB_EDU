package day01.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// Scanner 대신 BufferedReader 로
public class b_11660 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(st.nextToken()); int m = Integer.parseInt(st.nextToken());
		int[][] arr = new int[n+1][n+1];
		for(int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= n; j++) {
				arr[i][j] = arr[i][j-1] + Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i = 1; i <= m; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken()); int y1 = Integer.parseInt(st.nextToken()); 
			int x2 = Integer.parseInt(st.nextToken()); int y2 = Integer.parseInt(st.nextToken());
			int hap = 0;
			for(int j = x1; j <= x2; j++) {
				hap += arr[j][y2] - arr[j][y1-1];
			}
			sb.append(hap + "\n");   // 시간초과 어디서..... 
		}
		System.out.println(sb);
	}

}
