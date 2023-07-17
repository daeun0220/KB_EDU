package day04.bruteforce;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class kb2반_알고리즘2번_김다은 {
	
	public static int N, M;
	public static int[] arr;
	public static int answer;

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N];
		st = new StringTokenizer(bf.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		answer = 0;
		dfs(0,0,0);
		System.out.println(answer);
	}
	
	public static void dfs(int n, int cnt, int hap) {
		if(n == N) {
			if( hap <= M && cnt == 3 ) 
				answer = Math.max(hap, answer);
			return;
		}
		dfs(n+1, cnt+1, hap+arr[n]); // 선택할때
		dfs(n+1, cnt, hap); //선택안할때
	}

}
