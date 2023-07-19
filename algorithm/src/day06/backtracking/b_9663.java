package day06.backtracking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_9663 {
	
	public static int T, N, cnt;
	public static boolean[] visit;
	public static int[] num;

	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		T = Integer.parseInt(bf.readLine());
		for(int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(bf.readLine());
			N = Integer.parseInt(st.nextToken());
			visit = new boolean[N];
			num = new int[N];
			cnt = 0;
			chess(0);
			System.out.println("#" + tc + " " + cnt);
		}
	}
	public static void chess(int n) {
		if(n == N) {
			for(int i = 0; i < N-1; i++) {
				for(int j = i+1; j < N; j++) {
					if(Math.abs(num[i] - num[j]) == Math.abs(i - j)) {
						return;
					}
				}
			}
			cnt++;
			return;
		}
		for(int i = 0; i < N; i++) {
			if(!visit[i]) {
				visit[i] = true;
				num[n] = i+1;
				chess(n+1);
				visit[i] = false;
 			}
		}
		
	}

}
