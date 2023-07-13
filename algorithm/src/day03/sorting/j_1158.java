package day03.sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 삽입정렬
public class j_1158 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());

		int n = Integer.parseInt(st.nextToken()); 
		ArrayList<Integer> arr = new ArrayList<>();
		st = new StringTokenizer(bf.readLine());
		for(int i = 0; i < n; i++) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		
		for(int i = 1; i < n; i++) {
			int index = i;
			for(int j = 0; j < i; j++) {
				if(arr.get(i) < arr.get(j)) {
					index = j;
					break;
				}
			}
			arr.add(index, arr.get(i));
			arr.remove(i+1);
			StringBuilder sb = new StringBuilder();
			for(int k : arr) {
				sb.append(k).append(" ");
			}
			System.out.println(sb);
		}

	}

}
