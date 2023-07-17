package day04.bruteforce;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_1182 {
	
	public static int[] arr;
	public static int N, S;
	public static int ans;

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		N = Integer.parseInt(st.nextToken());
		S = Integer.parseInt(st.nextToken());
		arr = new int[N];
		st = new StringTokenizer(bf.readLine());  // " " 붙여줘야하나..?
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		dfs(0,0,0);
		System.out.println(ans);
	}
	
	public static void dfs(int n, int cnt, int sum) {
		if(n == N) {
			if(cnt > 0 && sum == S) ans++;
			return;
		}
		// 선택하는 경우  
		dfs(n+1, cnt+1, sum+arr[n]);
		// 선택하지 않는 경우 
		dfs(n+1, cnt, sum);
		
	}

}
