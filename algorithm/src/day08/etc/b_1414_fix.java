package day08.etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class b_1414_fix{
	public static int[] p;

	static class Node implements Comparable<Node>{
		int to;
		int from;
		int value;
		public Node(int to, int from, int value) {
			this.to = to;
			this.from = from;
			this.value = value;
		}
		@Override
		public int compareTo(Node o) {
		return this.value - o.value;
		}
	}
	static int n;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		char[][] map = new char[n][n];
		for(int i=0; i<n; i++) {
			map[i] = br.readLine().toCharArray();
		}
		
		p = new int[n+1];
		for(int i=1; i<=n; i++) {
			p[i] = i;
		}
		
		int total = 0;
		Queue<Node> pq = new PriorityQueue<>();
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if('a' <= map[i][j] && map[i][j] <= 'z') {
					total += map[i][j]-96;
					pq.add(new Node(i+1,j+1, map[i][j]-96));
				}else if('A' <= map[i][j] && map[i][j] <= 'Z') {
					total += map[i][j]-38;
					pq.add(new Node(i+1,j+1, map[i][j]-38));
				}
			}
		}
		
		int size = pq.size();
		int cycleNode = 1;
		int result = 0;
		for(int i=0; i<size; i++) {
			Node node = pq.poll();
			int rx = findSet(node.to);
			int ry = findSet(node.from);
			
			if(rx != ry) {
				cycleNode++;
				result += node.value;
				union(node.to, node.from);
			}
		}
		if(cycleNode != n) {
			System.out.println(-1);
		}else {
			System.out.println(total-result);	
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
