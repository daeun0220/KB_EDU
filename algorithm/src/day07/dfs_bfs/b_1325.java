package day07.dfs_bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
// 방향성 있는 간선 문제...! 
//메모리 초과 다시.. --> 인접행렬 때문..
// 인접 리스트 BFS로 다시...
public class b_1325 {

	public static int N, M, cnt, ans;
	public static int[] answer;
	public static boolean[] visit;
	public static ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
	
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		for(int i=0;i<=N;i++){
            arr.add(new ArrayList<>());
        }
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(bf.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			arr.get(x).add(y);
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
			sb.append(i+1 + " ");
		}
		System.out.println(sb.toString());
	}
	
	public static void dfs(int v) {
		visit[v] = true;
		
		for(int i : arr.get(v)) {
			if(!visit[i]) {
				cnt++;
				visit[i] = true;
				dfs(i);
			}
		}
	}

}
