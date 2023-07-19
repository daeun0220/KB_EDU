package day06.backtracking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_9936_fix {

	public static int T, N, cnt;
	public static boolean[] visit;
	public static int[] num;

	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(bf.readLine());
		visit = new boolean[N];
		num = new int[N];
		cnt = 0;
		chess(0);
		System.out.println(cnt);
		
	}
	public static void chess(int n) {
		if(n == N) {
			cnt++;
			return;
		}
		for(int i = 0; i < N; i++) {
			num[n] = i+1;
			
			if(check(n)) {
				chess(n+1);
			}
		}
	}
	
	public static boolean check(int c) {
		for(int i = 0; i < c; i++) {
			if(num[c] == num[i]) {
				return false;
			}
			else if(Math.abs(num[c] - num[i]) == Math.abs(c-i)) {
				return false;
			}
		}
		return true;
	}

}
