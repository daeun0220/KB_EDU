package day03.sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class j_1814 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());

		int n = Integer.parseInt(st.nextToken()); 
		ArrayList<Integer> arr = new ArrayList<>();
		st = new StringTokenizer(bf.readLine());
		for(int i = 0; i < n; i++) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		
		int cnt = 0;
		for(int i = 1; i < n; i++) {
			int index = i;
			for(int j =0; j < i; j++) {
				if(arr.get(i) < arr.get(j)) {
					index = j;
					break;
				}
			}
			arr.add(index, arr.get(i));
			arr.remove(i+1);
			cnt += i - index;
		}
		System.out.println(cnt);

	}

}
