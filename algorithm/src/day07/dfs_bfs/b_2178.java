package day07.dfs_bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b_2178 {

	public static int N, M, cnt;
	public static char[][] arr;
	public static int[][] ans;
	public static boolean[][] visit;
	public static Queue<int[]> q = new LinkedList<>();
	
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new char[N][M];
		ans = new int[N][M];
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(bf.readLine());
			String s = st.nextToken();
			for(int j = 0; j < M; j++) {
				arr[i][j] = s.charAt(j);
				ans[i][j] = 1;
			}
			// 문자열 받기
		}
		visit = new boolean[N][M];
		cnt = 0;
		bfs(0,0);
		System.out.println(ans[N-1][M-1]);
	}
	public static void bfs(int a, int b) {
		int[] ab = {a, b};
		int[] dx = {0,0,1,-1};
		int[] dy = {1,-1,0,0};
		q.add(ab);
		visit[a][b] = true;
		
		while(!q.isEmpty()) {
			int[] xy = q.poll();
			int x = xy[0];
			int y = xy[1];
			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < M; j++) {
					for(int k = 0; k < 4; k++) {
						int nx = x + dx[k];
						int ny = y + dy[k];
						if(nx >= 0 & nx < N & ny >= 0 & ny < M) {
							if(arr[nx][ny] == '1' & !visit[nx][ny]) {
								cnt++;
								ans[nx][ny] += ans[x][y];
								int[] nxy = {nx, ny};
								q.add(nxy);
								visit[nx][ny] = true;
							}
							
						} 
					}
				}
			}
		}
	}

}
