package day07.dfs_bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b_1325_fix {

	public static int N, M, cnt, ans;
	public static int[] answer;
	public static boolean[] visit;
	public static ArrayList <Integer>[] arr;
	public static Queue<Integer> q = new LinkedList<>();
	
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new ArrayList[N+1];
		for(int i = 0; i < N+1; i++) {
			arr[i] = new ArrayList<Integer>();
		}
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(bf.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			arr[x].add(y);
		}
		ans = 0;
		answer = new int[N+1];
		for(int i = 1; i <= N; i++) {
			visit = new boolean[N+1];
			cnt = 0;
			bfs(i);
		}
		for(int i = 1; i <= N; i++) {
			ans = Math.max(ans, answer[i]);
		}
		for(int i = 1; i <= N; i++) {
			if(answer[i] == ans) {
				sb.append(i + " ");
			}
		}
		System.out.println(sb);
	}
	
	public static void bfs(int v) {
		//Queue<Integer> q = new LinkedList<>(); // 뭔차이.....? 
		visit[v] = true;
		q.add(v);
		
		while(!q.isEmpty()) {
			int x = q.poll();
			for(int i : arr[x]) {
				if(!visit[i]) {
					q.add(i);
					visit[i] = true;
					answer[i]++;
					
				}
			}
		}
	}
}
