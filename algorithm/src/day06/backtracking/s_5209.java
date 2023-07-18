package day06.backtracking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s_5209 {
// 중복되지 않도록 공장 선택... -> visit 만들어줘야한다 
	public static int T, N, ans;
	public static int[][] arr;
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
			ans = 1500;
			visit = new boolean[N];  
			permutation(0, 0);
			System.out.printf("#%d %d", tc, ans);
			System.out.println();
		}

	}
	
	public static void permutation(int n, int sum) {
	// 종료조건. 재귀를 끝낼 조건.
	if(n == N) {
		ans = Math.min(ans, sum);
		return;
	}
	// 하부단계 호출
	for( int i = 0; i < N; i++) {
		if(!visit[i]) {  
			if(sum >= ans) {    // 시간초과 방지용...! 
				break;
			}
			visit[i] = true;
			permutation(n+1, sum+arr[i][n]); // 재귀 호출
			visit[i] = false;  // 다시 해제해야한다 
			
		}
	}
}

}
