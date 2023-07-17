package day04.bruteforce;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s_5215 {
	
	public static int N, L, T, K; // 문제에서 주어지는 재료수, 제한칼로리, 맛점수, 칼로리 변수
	public static int answer; 
	public static int[][] arr;   // 맛 점수와 칼로리 담는 2차원 배열
	
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int testcase = Integer.parseInt(st.nextToken());
		for(int i = 1; i <= testcase; i++) {
			st = new StringTokenizer(bf.readLine());
			N = Integer.parseInt(st.nextToken());
			L = Integer.parseInt(st.nextToken());
			arr = new int[N][2];
			for(int j = 0; j < N; j++) {
				st = new StringTokenizer(bf.readLine());  // 매 줄마다 입력받게 해야함 
				T = Integer.parseInt(st.nextToken());
				K = Integer.parseInt(st.nextToken());
				arr[j][0] = T;  
				arr[j][1] = K;
			}
			answer = 0;
			dfs(0,0,0,0);
			System.out.printf("#%d %d", i, answer);
			System.out.println();
		}

	}
	
	public static void dfs(int n, int cnt, int kal, int taste) {
		if(n == N) {
			if(kal <= L & cnt > 0) {  // 제한칼로리 이하의 재료 조합 중
				answer = Math.max(taste, answer);  // 최대 맛 점수가 answer 이다
			} return;
		}
		// 선택했을때 --> cnt+1, kal 더해주고, taste 더해줘야한다
		dfs(n+1, cnt+1, kal+arr[n][1], taste+arr[n][0]);
		// 선택 안했을때
		dfs(n+1, cnt, kal, taste);
	}

}
