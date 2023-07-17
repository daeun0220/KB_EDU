package day04.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_9742 {
	
	public static char[] chars;
	public static boolean visit[];
	public static int totalCnt;
	public static int num;
	
	public static String ans;

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String line;
		
		while((line = bf.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(line);
			String str = st.nextToken();
			num = Integer.parseInt(st.nextToken());
			
			totalCnt = 0;
			chars = new char[str.length()];
			visit = new boolean[str.length()];
			permutation(str, 0);
			
			if(totalCnt < num) {
				ans = "No permutation";
			}
			System.out.println(str + " " + num + " = " + ans);
		}
		
		

	}
	
	public static void permutation(String str, int depth) {
		if(depth == str.length()) {
			totalCnt += 1;
			if( totalCnt == num) {
				ans = new String(chars);
			}
			return;
		}
		
		for(int i = 0; i < str.length(); i++) {
			if(!visit[i]) {
				visit[i] = true;
				chars[depth] = str.charAt(i);
				permutation(str, depth+1);
				visit[i] = false;
			}
		}
		
	}

}
