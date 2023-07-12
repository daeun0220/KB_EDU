package day02.stackandqueue;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
//탑의 번호 어떻게 가져가는지...
// Stack 에 배열도 넣을 수 있다 
public class b_2493 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] arr = new int[n][2];
		int[] ans = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i][0] = i+1;
			arr[i][1] = sc.nextInt();
		}

		Stack<Integer> stack = new Stack<>();
		stack.push(arr[0][1]);  
		ans[0] = 0; 

		for(int i = 1; i < n; i++) {
			if(stack.peek() <= arr[i][1]) {
				while(stack.peek() <= arr[i][1]) {
					stack.pop();
					if(stack.isEmpty()) {
						ans[i] = 0;
						break;
					}
				}
			}
			if(!stack.isEmpty()) {
				if(stack.peek() > arr[i][1]) {
					int a = stack.peek();
					ans[i] = Arrays.binarySearch(arr, a);

				} 

			}
			stack.push(arr[i][1]);
		}
		for(int i = 0; i < n; i++) {
			System.out.print(ans[i] + " ");
		}

	}
}
