package day03.sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class b_2750 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());

		int n = Integer.parseInt(st.nextToken()); 
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(bf.readLine());
			arr.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(arr);
		for(int i = 0; i < n; i++) {
			System.out.println(arr.get(i));
		}

	}

}
