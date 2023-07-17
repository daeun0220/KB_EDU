package day04.bruteforce;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 순열 -> 백트래킹 
public class b_15649 {
	
	public static int[] arr;
	public static boolean[] visit;
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		arr = new int[m];
		visit = new boolean[n];
		permutation(n, m, 0);
		System.out.println(sb);
		
	}
	
	public static void permutation(int n, int m, int depth) {
		// 종료조건. 재귀를 끝낼 조건.
		if(depth == m) {
			for( int val : arr) {
				sb.append(val).append(' ');
			}
			sb.append('\n');
			return;
		}
		// 하부단계 호출
		for( int i = 0; i < n; i++) {
			if(!visit[i]) {  // 사용하지 않았을 때 
				visit[i] = true;
				arr[depth] = i + 1;
				permutation(n, m, depth +1); // 재귀 호출
				visit[i] = false;  // 다시 해제해야한다 
			}
		}
	}

}
