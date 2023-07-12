package day02.stackandqueue;

import java.util.Scanner;
import java.util.Stack;
//EmptyStackException 해결.....
public class b_17608 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] harr = new int[n];
		for(int i = 0; i < n; i++) {
			harr[i] = sc.nextInt();
		}
		
		Stack<Integer> stack = new Stack<>();
		stack.push(harr[0]);
		for(int i = 1; i < n; i++) {
			while(stack.peek() <= harr[i]) {
				stack.pop();
				if(stack.isEmpty()) break;
			} stack.push(harr[i]);
		}
		System.out.println(stack.size());
	}

}
