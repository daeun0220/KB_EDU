package day08.etc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_1717 {
	public static int[] p; 
	public static int n, m; 
	
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		p = new int[n+1];
		for (int i=1; i<=n; i++) p[i]=i;
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(bf.readLine());
			int c = Integer.parseInt(st.nextToken());
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			if(c == 0) {
				union(num1, num2);
			}
			else if(c == 1) {
				if(findSet(num1) == findSet(num2)) System.out.println("YES");
				else System.out.println("NO");
			}
		}

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
