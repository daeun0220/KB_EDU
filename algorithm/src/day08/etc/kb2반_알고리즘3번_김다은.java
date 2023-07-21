package day08.etc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class kb2반_알고리즘3번_김다은 {

	public static int[] arr; 
	public static int N, M, ans; 
	
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(bf.readLine());
		arr = new int[N+1];
		for(int i = 1; i <= N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		ans = 0;
		dfs(0, 0, 1);  // 시작위치는 0, 초기크기는 1
		System.out.println(ans);
	}
	
	public static void dfs(int t, int idx, int sum) {
		if(t == M | idx == N) {  // 시간이 다 됐거나 끝지점에 도달할 경우
			ans = Math.max(ans, sum);
			return;
		}
		dfs(t+1, idx+1, sum+arr[idx+1]);    // 밀기
		dfs(t+1, idx+2, sum/2+arr[idx+2]);  // 던지기
	}

}
