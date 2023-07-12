package day02.stackandqueue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class b_2493_fix {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer stz = new StringTokenizer(br.readLine());
		Stack<int[]> st = new Stack<>();
		
		for(int n = 1; n <= N; n++) {
			int current = Integer.parseInt(stz.nextToken()); 
			while(!st.empty()) {
				if(st.peek()[1] < current) st.pop(); 
				else { 
					System.out.print(st.peek()[0] + " ");
					break;
				}
			}
			if(st.isEmpty()) 
				System.out.print("0 "); 
			st.push(new int[] {n, current}); 
		}
	}

}
