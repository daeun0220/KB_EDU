package day03.sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class j_1157 {
	// 버블정렬
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());

		int n = Integer.parseInt(st.nextToken()); 
		int[] arr = new int[n];
		st = new StringTokenizer(bf.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		for(int i = n-1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
			StringBuilder sb = new StringBuilder();
			for(int k : arr) {
				sb.append(k).append(" ");
			}
			System.out.println(sb);
		}
		
	}

}
