package day07.dfs_bfs;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b_1325_fixfix {
	static int N, M;
	static int[] ans;
	static ArrayList<Integer> adj[];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));	//	파일로부터 읽기
		StringTokenizer st = new StringTokenizer(br.readLine());

		// [0] 입력처리
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		adj = new ArrayList[N+1];
		for (int i=1; i<=N; i++) {
			adj[i] = new ArrayList<Integer>();	
		}
		
		for (int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			adj[s].add(e);
		}
//		System.out.println(Arrays.deepToString(adj));
		
		// [1] 1 ~ N번노드까지 각각 신뢰하는 노드를 탐색 X ++
		// bfs 탐색하면서 첫 방문시 탐색노드 위치 빈도수 배열(룩업테이블) ++
		// 노드수 및 연결이 많을때 dfs탐색시 => 재귀호출제한 또는 메모리 또는 시간초과 발생 가능
		ans = new int[N+1];
		for (int i=1; i<=N; i++)	bfs(i);
		
		// [2] 빈도수 최대값 찾기
		int max = 0;
		for (int i=1; i<=N; i++) {
			max = Math.max(max, ans[i]);
		}
		
		// [3] 최대값을 갖는 노드 오름차순으로 출력
		StringBuilder sb = new StringBuilder();
		for (int i=1; i<=N; i++) {
			if (ans[i]==max)	sb.append(i).append(" ");
		}
		System.out.println(sb);
	}
	
	public static void bfs(int s) {
		Queue<Integer> q = new LinkedList<>();
//		boolean[] v = new boolean[N+1];
		int[] v = new int[N+1];
		
		q.add(s);
		v[s]=1;
		
		while (!q.isEmpty()) {
			int c = q.poll();
			for (int n: adj[c]) {
				if (v[n]==0) {
					q.add(n);
					v[n]=1;
					ans[n]++;
				}
			}
		}
	}
}
