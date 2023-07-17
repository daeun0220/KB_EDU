package day05.tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_11047 {
	static int N, K;
	static int[] arr;
	static int ans;

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		arr = new int[N];
		ans = 0;
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(bf.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int money = K;
		for(int i = N-1; i >= 0; i--) {  // 범위 주의 
			if(arr[i] <= money) {
				ans += money/arr[i];
				money = money % arr[i];
			}

		}
		System.out.println(ans);
		
	}

}
