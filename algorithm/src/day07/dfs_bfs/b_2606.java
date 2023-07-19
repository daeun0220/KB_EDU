package day07.dfs_bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_2606 {
	public static int n, m, cnt;
	public static int[][] arr;
	public static boolean[] visit;

	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		n = Integer.parseInt(bf.readLine());
		st = new StringTokenizer(bf.readLine());
		m = Integer.parseInt(st.nextToken());
		arr = new int[n+1][n+1];
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a][b] = arr[b][a] = 1;
		}
		cnt = 0;
		visit = new boolean[n+1];
		dfs(1);
		System.out.println(cnt);

	}
	public static void dfs(int v) {
		visit[v] = true;
		
		for(int i = 1; i <= n; i++) {
			if(!visit[i] & arr[v][i] == 1) {
				cnt += 1;
				dfs(i);
			}
		}
	}

}
