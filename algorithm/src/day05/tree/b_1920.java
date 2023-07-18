package day05.tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b_1920 {
//ArrayIndexOutOfBounds
	public static int[] arr, arr2;
	public static int N, M;

	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.parseInt(bf.readLine());
		arr = new int[N];
		
		st = new StringTokenizer(bf.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		
		M = Integer.parseInt(bf.readLine());
		arr2 = new int[M];
		Arrays.sort(arr);
		st = new StringTokenizer(bf.readLine());
		for(int i = 0; i < M; i++) {
			System.out.println(binarySearch(Integer.parseInt(st.nextToken()), 0, N-1 ));
		}
		
		
	}
	// **** 비교할 배열 주의 *****
	public static int binarySearch(int key, int low, int high) {
		int mid;
		
		while(low <= high) {
			mid = (low + high) / 2;
			
			if(key == arr[mid]) {
				return 1;
			} else if(key < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return 0; // 탐색 실패 
	}

}
