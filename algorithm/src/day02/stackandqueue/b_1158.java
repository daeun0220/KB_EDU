package day02.stackandqueue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class b_1158 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); 
		int k = sc.nextInt();
		int[] arr = new int[n];
		Deque<Integer> deque = new LinkedList<>();
		
		for(int i = 1; i <= n; i++) {
			deque.add(i);
		}
		
		int a = 0;
		while(true) {
			if(deque.isEmpty()) break;
			
			for(int i = 0; i < k-1; i++) {
				deque.add(deque.peek());
				deque.poll();
			}
			arr[a++] = deque.peek();
			deque.poll();
			
		}
		System.out.print("<");
		for(int i = 0; i < n; i++) {
			if(i == n-1) System.out.print(arr[i]);
			else System.out.print(arr[i] + ", ");
		}
		System.out.print(">");
		
	}

}
