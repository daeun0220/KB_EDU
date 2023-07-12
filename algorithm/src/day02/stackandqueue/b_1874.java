package day02.stackandqueue;

import java.util.Scanner;
import java.util.Stack;

public class b_1874 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = sc.nextInt();
		int start = 0;
		
		Stack<Integer> stack = new Stack<>();
		
		while(n-- > 0) {  // 0 보다 조건값을 뺀 값이 클 경우 
			int a = sc.nextInt();
			
			if(a > start) {
				for(int i = start + 1; i <= a; i++) {
					stack.push(i);
					sb.append('+').append('\n');
				}
				start = a;
			}
			else if(stack.peek() != a) {
				System.out.println("NO");
				return; // System.exit(0);
			}
			stack.pop();
			sb.append('-').append('\n');
		}
		System.out.println(sb);
	}
}
