package day06.backtracking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s_13992 {

	public static int T, N, ans, cnt;
	public static int[][] arr;
	public static int[] route;
	public static boolean[] visit;
	
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		T = Integer.parseInt(bf.readLine());
		for(int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(bf.readLine());
			N = Integer.parseInt(st.nextToken());
			arr = new int[N][N];
			for(int i = 0; i < N; i++) {
				st = new StringTokenizer(bf.readLine());
				for(int j = 0; j < N; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			route = new int[N-1];
			ans = 1000;
			visit = new boolean[N];
			battery(0,0);
			System.out.println("#" + tc + " " + ans);
		}

	}
	
	public static void battery(int n, int idx) {
		if(n == N-1) {
			int cnt = 0;
			//int[] route = new int[N-1];
			for(int i = 0; i < route.length; i++) {
				if(i == 0) cnt += arr[0][route[i]];
				else if(i == route.length-1) cnt += arr[route[i]][0];
				else cnt += arr[route[i]][route[i+1]];
			}
			ans = Math.min(ans, cnt);
			return;
		}
		for(int i = 1; i < N; i++) {
			if(!visit[i]) {
				visit[i] = true;
				route[n] = i;
				battery(n+1, i+1);
				visit[i] = false;
			}
		}
		
	}

}


