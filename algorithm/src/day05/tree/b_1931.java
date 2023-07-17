package day05.tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b_1931 {

	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int[][] arr = new int[N][2];
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(bf.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken()); // 시작
			arr[i][1] = Integer.parseInt(st.nextToken()); // 끝 
		}
		
		// 오버라이딩 
		//종료시간이 같은 경우 시작시간이 빠른 순으로 비교....
		Arrays.sort(arr, (o1, o2) -> {
			if(o1[1] == o2[1]) {    // 종료시간을 기준으로 정렬하고
				return Integer.compare(o1[0], o2[0]);  // o1[0] - o2[0]
			}
			return Integer.compare(o1[1], o2[1]);
		});
		// Arrays.sort(arr, (x, y) -> x[1] == y[1]? x[0] - y[0] : x[1] - y[1]); 
		
		int cnt = 0;
		int end = 0;
		for(int i = 0; i < N; i++) {
			if(end <= arr[i][0]) {
				end = arr[i][1];
				cnt++;
			}
		}
		System.out.println(cnt);
		
	}

}
