package day05.tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.StringTokenizer;
// 중위...
public class s_1233 {
	// 단말노드일 때 숫자 , 단말노드가 아닐때 연산자여야한다
	static int N, ans;
	static char[] tree;

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer st = new StringTokenizer(bf.readLine());
		
		//int testcase = Integer.parseInt(st.nextToken());
		
		for(int tc = 1; tc <= 10; tc++) {
			N = Integer.parseInt(bf.readLine());
			tree = new char[N+1];
			ans = 1;
			
			for(int i = 1; i <= N; i++) {
				tree[i] = bf.readLine().split(" ")[1].charAt(0);
			}
			// 완전이진트리 가장 끝 노드부터 반대방향으로 
			for(int i = N; i > 1; i-=2) {
				if(Character.isDigit(tree[i]) & Character.isDigit(tree[i-1]) & !Character.isDigit(tree[i/2]))
					tree[i/2] = '1';
				else {
					ans = 0;
					break;
				}
			}
			System.out.println("#" + tc + " " + ans);
			
		}

	}
}
