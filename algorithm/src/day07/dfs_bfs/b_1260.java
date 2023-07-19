package day07.dfs_bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b_1260 {
	public static int N, M, V;
	public static int[][] arr;
	public static boolean[] visit;
	public static StringBuilder sb = new StringBuilder();
	public static Queue<Integer> q = new LinkedList<>();
	
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());
		
		arr= new int[N+1][N+1];
		visit = new boolean[N+1];
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(bf.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			arr[x][y] = arr[y][x] = 1;
			
		}
		dfs(V);
		sb.append("\n");
		visit = new boolean[N+1];
		bfs(V);
		System.out.println(sb);
		
	}
	public static void dfs(int v) {
		visit[v] = true;
		sb.append(v + " ");
		
		for(int i = 0; i <= N; i++) {
			if(arr[v][i] == 1 & !visit[i]) {
				dfs(i);
			}
		}
	}
	public static void bfs(int v) {
		q.add(v);
		visit[v] = true;
		
		while(!q.isEmpty()) {
			v = q.poll();
			sb.append(v + " ");
			
			for(int i = 1; i <= N; i++) {
				if(arr[v][i] == 1 & !visit[i]) {
					q.add(i);
					visit[i] = true;
				}
			}
		}
	}
}
