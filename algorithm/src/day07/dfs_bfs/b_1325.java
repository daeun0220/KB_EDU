package day07.dfs_bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 방향성 있는 간선 문제...! 
public class b_1325 {

	public static int N, M, cnt, ans;
	public static int[][] arr;
	public static int[] answer;
	public static boolean[] visit;

	
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr= new int[N+1][N+1];
		visit = new boolean[N+1];
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(bf.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			arr[y][x] = 1;	
		}
		
		ans = 0;
		answer = new int[N];
		for(int i = 1; i <= N; i++) {
			visit = new boolean[N+1];
			cnt = 0;
			dfs(i);
			answer[i-1] = cnt;
			ans = Math.max(ans, cnt);

		}
		for(int i = 0; i < N; i++) {
			if(answer[i] == ans)
			System.out.print(i+1 + " ");
		}
		
	}
	
	public static void dfs(int v) {
		visit[v] = true;
		
		for(int i = 1; i <= N; i++) {
			if(!visit[i] & arr[v][i] == 1) {
				cnt++;
				visit[i] = true;
				dfs(i);
			}
		}
	}

}
