package day06.backtracking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s_1486 {
	
	public static int T, N, B, ans;
	public static int[] arr;
	
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		T = Integer.parseInt(bf.readLine());
		for(int i = 1; i <= T; i++) {
			st = new StringTokenizer(bf.readLine());
			N = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			
			arr = new int[N];
			st = new StringTokenizer(bf.readLine());
			for(int j = 0; j < N; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			ans = 200000;
			height(0,0,0);
			System.out.printf("#%d %d", i, ans-B);
			System.out.println();
		}
	}
	public static void height(int n, int cnt, int sum) {
		if(n == N) {
			if(cnt > 0 & sum >= B) 
				ans = Math.min(ans, sum);
			return;
		}
		height(n+1, cnt+1, sum+arr[n]);
		height(n+1, cnt, sum);
	}

}
