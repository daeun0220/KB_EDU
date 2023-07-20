package day07.dfs_bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
// dfs로도 풀어보기 
public class b_2667 {

	public static int N, cnt;
	public static char[][] arr;
	public static boolean[][] visit;
	public static Queue<int[]> q = new LinkedList<>();
	
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		N = Integer.parseInt(st.nextToken());
		arr = new char[N][N];
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(bf.readLine());
			String s = st.nextToken();
			for(int j = 0; j < N; j++) {
				arr[i][j] = s.charAt(j);
			}

		}
		ArrayList<Integer> ans = new ArrayList<>();
		visit = new boolean[N][N];
		int res = 0;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(arr[i][j] == '1' & !visit[i][j]) { //visit 표시...!! 1 볼때마다 돌지않게
					cnt = 1;
					bfs(i, j);
					ans.add(cnt);
					res++;
				}
			}
		}
		Collections.sort(ans);
		System.out.println(res);
		for(int i = 0; i < ans.size(); i++) {
			System.out.println(ans.get(i));
		}

	}
	
	public static void bfs(int a, int b) {
		int[] dx = {0,0,-1,1};
		int[] dy = {1,-1,0,0};
		int[] ab = {a, b};
		visit[a][b] = true;
		q.add(ab);
		
		while(!q.isEmpty()) {
			int[] xy = q.poll();
			int x = xy[0];
			int y = xy[1];
			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					for(int k = 0; k < 4; k++) {
						int nx = x + dx[k];
						int ny = y + dy[k];
						if(nx >= 0 & nx < N & ny >= 0 & ny < N ) {
							if(!visit[nx][ny] & arr[nx][ny] == '1') {
								cnt++;
								visit[nx][ny] = true;
								int[] nxy = {nx, ny};
								q.add(nxy);
							}
						}
					}
				}
			}
		}
		
	}

}
