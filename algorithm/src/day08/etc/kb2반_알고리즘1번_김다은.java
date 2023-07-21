package day08.etc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class kb2반_알고리즘1번_김다은 {

	public static int[] p; 
	public static int N, M, ans; 
	
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		N = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(bf.readLine());
		M = Integer.parseInt(st.nextToken());
		p = new int[N+1];
		for (int i=1; i<=N; i++) p[i]=i;
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			union(a,b);
		}
		ans = 0;
		for(int i = 2; i <= N; i++) {
			if(findSet(1) == findSet(i)) ans++;  // 철수와 친구인지 확인
		}
		System.out.println(ans);
	}
	
	public static int findSet(int n) {
		// find한 경로에 있는 노드들을 루트밑에 바로 붙임
		if (n == p[n]) return n;
		return p[n] = findSet(p[n]);
	}
	
	public static void union(int a, int b) {
		// 집합을 합쳐주는 것이므로 주의!!
		p[findSet(b)] = findSet(a);
	}

}
