package com.edu.hw;

import java.util.Arrays;
import java.util.Scanner;

public class FlattenBoxTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = 10;
		int boxLen = 100;
		for(int tcn = 1; tcn<=tc; tcn++) {
			int dump = sc.nextInt();
			int[ ] boxes = new int[boxLen];
			for(int i=0; i<boxes.length; i++) {
				boxes[i] = sc.nextInt();
			}//초기화 완료...
			
			int heighDiff=flatten(boxes,dump );
			System.out.printf("#%d %d%n",tcn, heighDiff);
		}
	}

	static int flatten(int[] boxes, int dump) {
		
		int[] newBoxes = new int[101];  // 최대 높이 100
		int minHeight = 100;
		int maxHeight = 0;
		// boxes : 8 2 2 3 4 7 
		// 0 , 1, 2, 3, 4, .... 100
		// newBoxes : 0 0 2 1 1 0 0 1 1
		for(int i : boxes) {
			newBoxes[i] += 1;			
			minHeight = Math.min(i, minHeight);
			maxHeight = Math.max(i, maxHeight);
		}
		
		for(int i = 0; i < dump; i++) {
			newBoxes[minHeight] -= 1;
			newBoxes[minHeight + 1] += 1;
			newBoxes[maxHeight] -= 1;
			newBoxes[maxHeight - 1] += 1;
			if(newBoxes[minHeight] == 0) {
				minHeight += 1;
			} 
			if(newBoxes[maxHeight] == 0) {
				maxHeight -= 1;
			}
			if(maxHeight - minHeight <= 1) {
				return maxHeight - minHeight; 
			}
		}
		return maxHeight - minHeight;
	}

}
