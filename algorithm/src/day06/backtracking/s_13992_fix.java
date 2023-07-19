package day06.backtracking;
//전자카트
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//배열 없이 sum 더하고 넘기는 방법 / 실수 줄일 수 있다 
public class s_13992_fix {

	public static int T, N, ans, cnt;
	public static int[][] arr;
	public static int[] route;
	public static boolean[] visit;
	
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		T = Integer.parseInt(bf.readLine());
		for(int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(bf.readLine());
			N = Integer.parseInt(st.nextToken());
			arr = new int[N][N];
			for(int i = 0; i < N; i++) {
				st = new StringTokenizer(bf.readLine());
				for(int j = 0; j < N; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			ans = 1000;
			visit = new boolean[N+1];
			battery(0,0,0);
			System.out.println("#" + tc + " " + ans);
		}

	}
	
	public static void battery(int n, int v, int sum) {  // 시작 위치 v 저장 
		//가지치기 : 맨 위에 작성. 마지막에 시간 남으면 작성. 연습할 때 작성해보기..
		//if(ans <= sum) return;
		
		if(n == N-1) {
			ans = Math.min(ans, sum+arr[v][0]);
			return;
		}
		for(int i = 1; i < N; i++) {
			if(!visit[i]) {
				visit[i] = true;
				battery(n+1, i, sum+arr[v][i]);  // 변수잡기 주의..... 잘 생각.....
				visit[i] = false;
			}
		}
		
	}

}
