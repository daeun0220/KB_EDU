package day04.bruteforce;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class b_2961 {
	
	public static int N, taste1, taste2;
	public static int[][] arr;
	public static int ans;

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		N = Integer.parseInt(st.nextToken());
		arr = new int[N][2];
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(bf.readLine());
			int taste1 = Integer.parseInt(st.nextToken());
			int taste2 = Integer.parseInt(st.nextToken());
			arr[i][0] = taste1;
			arr[i][1] = taste2;
		}
		ans = 1000000000;
		dfs(0, 0, 1, 0);
		System.out.println(ans);
	}
	
	public static void dfs(int n, int cnt, int sum1, int sum2 ) {
		if(n == N) {
			if(cnt > 0) ans = Math.min(Math.abs(sum1-sum2), ans);
			return;
		} 
		
		dfs(n+1, cnt+1, sum1*arr[n][0], sum2+arr[n][1]);
		dfs(n+1, cnt, sum1, sum2);
	}

}
