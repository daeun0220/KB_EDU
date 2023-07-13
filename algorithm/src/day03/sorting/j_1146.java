package day03.sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


// 선택정렬
public class j_1146 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		st = new StringTokenizer(bf.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < n-1; i++) {
			//int m = 100;
			int mindex = i;
			for(int j = i+1; j < n; j++) {
				if(arr[mindex] > arr[j]) {
					mindex = j;   // 최소 값 인덱스만 구하면 --> 최소값은 따라오는거!! 
				}
			}
			int tmp = arr[mindex];
			arr[mindex] = arr[i];
			arr[i] = tmp;
			StringBuilder sb = new StringBuilder();
			for(int k : arr) {
				sb.append(k).append(" ");
			}
			System.out.println(sb);
		}

	}

}
