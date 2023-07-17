package day05.tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_2839 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		if(N>=5) {
			for(int i = N/5; i>=0; i--) {
				for(int j = 0; j <= N/3; j++) {
					if(5 * i + j * 3 == N) {
						System.out.println(i + j);
						return;
					}
				}
			}
			System.out.println(-1);
		}
		if(N==3) System.out.println(1);
		if(N==4) System.out.println(-1);
		
	}

}
