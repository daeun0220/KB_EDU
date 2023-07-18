package day06.backtracking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_14889 {
	public static int N, ans, cnt1, cnt2;
	public static int[][] arr;
	public static boolean[] visit;

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.parseInt(bf.readLine());
		arr = new int[N+1][N+1];
		for(int i = 1; i <= N; i++) {
			st = new StringTokenizer(bf.readLine());
			for(int j = 1; j <= N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		cnt1 = 0; cnt2 = 0;
		ans = 2000;
		visit = new boolean[N+1];
		team(0,1);
		System.out.println(ans);
		
	}
	
	public static void team(int n, int idx) {
		if(n == N/2) {  // 반은 visit true 상태, 반은 visit false 상태
			cnt1 = 0; cnt2 = 0;
			for(int i = 1; i <= N; i++) {
				for(int j = 1; j <= N; j++) {
					if(visit[i] & visit[j]) {
						cnt1 += arr[i][j];
					} else if(!visit[i] & !visit[j]) {
						cnt2 += arr[i][j];
					}
				}
				
			}
			ans = Math.min(Math.abs(cnt1-cnt2), ans);
			return;
		}
		
		for(int i = idx; i <= N; i++) {
				if(!visit[i]) {
					visit[i] = true;
					team(n+1, i+1);
					visit[i] = false;
				}
			
		}
	}

}
