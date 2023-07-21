package day08.etc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 여행가자
public class b_1976 {
	public static int[] p;
	public static int[] trip;
	public static int N, M;
	public static int[][] arr;

	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.parseInt(bf.readLine());
		st = new StringTokenizer(bf.readLine());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N+1][N+1];
		for(int i = 1; i <= N; i++) {
			st = new StringTokenizer(bf.readLine());
			for(int j = 1; j <= N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		trip = new int[M];
		st = new StringTokenizer(bf.readLine());
		for(int i = 0; i < M; i++) {
			trip[i] = Integer.parseInt(st.nextToken());
		}
		p = new int[N+1];
		for (int i=1; i<=N; i++) p[i]=i;
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= N; j++) {
				if(arr[i][j] == 1) union(i,j);
			}
		}
		for(int i = 0; i < M-1; i++) {
			if(findSet(trip[i]) != findSet(trip[i+1])) {
				System.out.println("NO");
				System.exit(0);
			}
				
		}
		System.out.println("YES");
		
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
