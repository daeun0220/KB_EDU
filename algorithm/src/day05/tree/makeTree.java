package day05.tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class makeTree {
	
	static int N;
	static int[] tree;

	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(bf.readLine());
		tree = new int[N+1];
		
		for(int i=1; i <= N; i++) {
			tree[i] = (char)('A'+ i-1);
		}
		postOrder(1);

	}
	
	public static void preOrder(int n) {
		//종료 조건 : 1~N 만 존재하는 노드
		if(1 <= n & n <= N) {
			System.out.print((char)tree[n] + " ");  // Root --> Right --> Left
			preOrder(n*2);
			preOrder(n*2+1);
		}
	}
	
	public static void postOrder(int n) {
		//종료 조건 : 1~N 만 존재하는 노드
		if(1 <= n & n <= N) {
			postOrder(n*2);    // Right(탐색) --> Left(탐색) --> Root(출력)
			postOrder(n*2+1);
			System.out.print((char)tree[n] + " ");
		}
	}

}
