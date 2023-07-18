package day05.tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 분할정복
public class b_2630 {
	
	public static int N;
	public static int[][] arr;
	public static int white, blue;

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.parseInt(bf.readLine());
		arr = new int[N+1][N+1];
		
		for(int i = 1; i <= N; i++) {
			st = new StringTokenizer(bf.readLine());
			for(int j = 1; j <= N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		partition(1, 1, N);
		System.out.println(white);
		System.out.println(blue);

	}
	public static void partition(int row, int col, int size) {
		
		if(check(row, col, size)) {
			if(arr[row][col] == 0) white++;
			else blue++;
			return;
		}
		size = size / 2;
		partition(row, col, size);
		partition(row, col+size, size);
		partition(row+size, col, size);
		partition(row+size, col+size, size);
	}
	
	public static boolean check(int row, int col, int size) {
		// 처음 색상과 같은지 확인 
		int c = arr[row][col];
		
		for(int i = row; i < row + size; i++) {
			for(int j = col; j < col + size; j++) {
				if(arr[i][j] != c) {
					return false;
				}
			}
		}
		return true;
		
	}
	

}
