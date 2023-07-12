package day02.stackandqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class b_2164 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] cards = new int[n];
		Queue<Integer> q = new LinkedList<>(); // new 뒤 type 생략 가능 
		for(int i = 1; i <= n; i++) {
			q.add(i);
		}
		int i = 0;
		while(q.size() > 1) {
			if(i == 0) {
				q.poll();
				i = 1;
			}
			if(i == 1) {
				q.add(q.peek());
				q.poll();
				i = 0;
			}
			
		}
		System.out.println(q.peek());
	}

}
