package day04.bruteforce;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class kb2반_알고리즘3번_김다은 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int[][] arr = new int[19][19];
		for(int i = 0; i < 19; i++) {
			st = new StringTokenizer(bf.readLine());
			for(int j = 0; j < 19; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int[] dx = {0, -1, 1, 0, -1, 1, -1, 1};  // 방향키 잡기 
		int[] dy = {1, 0, 0, -1, 1, 1, -1, -1};

		for(int i = 0; i < 19; i++) {
			for(int j = 0; j < 19; j++) {
				if(arr[i][j] == 1) {  // 바둑알 1일 경우 
						for(int k = 0; k < 8; k++) {
							int cnt1 = 1;
							for(int l = 1; l <= 4; l++) { // 바둑알 5개까지 1인지 확인 
							int nx = i + dx[k]*l;
							int ny = j + dy[k]*l;
							if(nx >= 0 & nx < 19 & ny >= 0 & ny < 19) {
								if(arr[nx][ny]==1) {
									cnt1++;
									if(cnt1 == 5) {
										System.out.println(1);
										System.out.println(i+1 + " " + j+1);
										return;
									}
									
							} else break;
						}
					}
				}
			}   
				else if(arr[i][j] == 2) {  // 바둑알 2일 경우 
				for(int k = 0; k < 8; k++) {
					int cnt2 = 1;
					for(int l = 1; l <= 4; l++) { // 바둑알 5개까지 2인지 확인 
					int nx = i + dx[k]*l;
					int ny = j + dy[k]*l;
					if(nx >= 0 & nx < 19 & ny >= 0 & ny < 19) {
						if(arr[nx][ny]==2) {
							cnt2++;
							if(cnt2 == 5) {
								System.out.println(2);
								System.out.println(i+1 + " " + j+1);
								return;
							}
						} 
					}
					}
				}
			}
				else break;
			}
		}
		System.out.println(0);   // 무승부일 경우
	} 
}
