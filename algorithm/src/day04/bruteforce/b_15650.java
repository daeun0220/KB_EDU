package day04.bruteforce;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_15650 {
	
	public static int[] arr;
	public static int n, m;
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[m];
		
		combination(1, 0);
		System.out.println(sb);

	}
	
	public static void combination(int at, int depth) {
		
		if(depth == m) {
			for (int val : arr) {
				sb.append(val).append(' ');
			}
			sb.append('\n');
			return;
		}
		
		for( int i = at; i <= n; i++) {
			arr[depth] = i;
			combination(i+1, depth+1);
		}
		
		
	}

}
