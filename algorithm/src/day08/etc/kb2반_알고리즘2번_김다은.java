package day08.etc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class kb2반_알고리즘2번_김다은 {

	public static int[][] arr; 
	public static boolean[][] visit;
	public static int N, M, A, B, ans; 
	public static Queue<int[]> q = new LinkedList<>();
	
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[M][N];
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(bf.readLine());
			String s = st.nextToken();
			for(int j = 0; j < N; j++) {
				if(s.charAt(j) == '1') arr[i][j] = 1;
				else arr[i][j] = 0;
			}
		}
		st = new StringTokenizer(bf.readLine());
		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
		
		visit = new boolean[M][N];
		ans = 0;
		bfs(B-1, A-1);
		int cnt = 0;
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				if(arr[i][j] == 1) cnt++;
				ans = Math.max(ans, arr[i][j]);
			}
		}
		System.out.println(ans+2); // 마지막으로 코로나 걸린 사람에 퇴소 날짜 더해준다 
		System.out.println(cnt-1); // 코로나 걸린 사람도 1로 남아서 제외한다
	}
	
	public static void bfs(int a, int b) {
		int[] dx = {0,0,1,-1};
		int[] dy = {1,-1,0,0};
		int[] ab = {a, b};
		q.add(ab);
		visit[ab[0]][ab[1]] = true;
		
		while(!q.isEmpty()) {
			int[] xy = q.poll();
			int x = xy[0];
			int y = xy[1];
			
			for(int i = 0; i < M; i++) {
				for(int j = 0; j < N; j++) {
					for(int k = 0; k < 4; k++) {
						int nx = x + dx[k];
						int ny = y + dy[k];
						if(nx >= 0 & nx < M & ny >= 0 & ny < N) {
							if(!visit[nx][ny] & arr[nx][ny] == 1) {
								visit[nx][ny] = true;
								arr[nx][ny] += arr[x][y];
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
