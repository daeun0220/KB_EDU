package day05.tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b_1920 {
	
	public static int[] arr, arr2, ans;
	public static int N, M;

	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		N = Integer.parseInt(st.nextToken());
		arr = new int[N];
		st = new StringTokenizer(bf.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(bf.readLine());
		
		M = Integer.parseInt(st.nextToken());
	arr2 = new int[M];
		st = new StringTokenizer(bf.readLine());
		for(int i = 0; i < M; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}
		
		ans = new int[M];
		Arrays.sort(arr);
		
		for(int i = 0; i < M; i++) {
			System.out.println(binarySearch2(arr2[i], 0, M-1 ));
		}
	}
	
	static int binarySearch2(int key, int low, int high) {
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
