package day01.array;

import java.util.Scanner;
// boolean 배열...! 
public class b_2563 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		boolean[][] arr = new boolean[100][100];
		int hap = 0;
		for(int i = 0; i < n; i++) {
			int xp = sc.nextInt();
			int yp = sc.nextInt();
			for(int x = xp; x < xp+10; x++) {
				for(int y = yp; y < yp+10; y++) {
					if(!arr[x][y]) {
						hap++;
						arr[x][y] = true;
					}
				}
			}
		}
		System.out.println(hap);
	}

}
