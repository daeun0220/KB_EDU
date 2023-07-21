package day08.etc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
//불우이웃돕기
//import java.io.*;
//import java.util.*;
public class b_1414 {
	static int p[];
	public static void main(String[] args) throws NumberFormatException, Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		PriorityQueue<int[]> q = new PriorityQueue<>((o1,o2)->o1[2]-o2[2]);
		int cnt=0,res=-1;
		int a = 0;
		int cable = 0;
		p = new int[n+1];
		for(int i=1;i<n+1;i++) p[i]=i;
		String temp;
		for(int i=0;i<n;i++) {
			temp = br.readLine();
			for(int j=0;j<n;j++) {
				a = temp.charAt(j)-0;
				if(temp.charAt(j)!='0') union(i, j);
				if(a>=97) a-= 96;
				else a -=38;
				if(temp.charAt(j)=='0') continue;
				cable += a;
				if(i==j) continue;
				q.offer(new int[]{i,j,a});   // 우선순위 큐에 i, j, 가중치 넣는다 
				
			}
		}
		a=0;
		if(!q.isEmpty()) {
			int[] comp;
			while(!q.isEmpty()) {
				comp = q.poll();
				union(comp[0], comp[1]);
				if(findSet(comp[0]) == findSet(comp[1])) {
					cnt++;
					a+=comp[2];
				}
				if(cnt==n-1) {
					res = cable - a;
					break;
				}
			}
		}
		if(n==1) res = cable;
		System.out.println(res);
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
