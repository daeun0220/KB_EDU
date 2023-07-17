package day04.bruteforce;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class kb2반_알고리즘1번_김다은 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(bf.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < n-1; i++) {

			int maxdex = i;
			for(int j = i+1; j < n; j++) {
				if(arr[maxdex] < arr[j]) {
					maxdex = j;   // 최대값 인덱스만 구하면 --> 최대값은 따라오는거!! 
				}
			}
			int tmp = arr[maxdex];
			arr[maxdex] = arr[i];
			arr[i] = tmp;
		}
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}

}
