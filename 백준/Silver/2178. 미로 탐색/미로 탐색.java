import java.util.*;
import java.io.*;

public class Main {

	static int maze[][];
	static int n;
	static int m;
	static boolean visited[][];
	
	// 상하좌우
	static int dx[] = {-1, 1, 0, 0};
	static int dy[] = {0, 0, -1, 1};
	
	public static void main(String args[]) throws IOException {

		// 입출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		// 미로 입력
		maze = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			String line = br.readLine();
			char toChar[] = line.toCharArray();
			
			for (int j = 0; j < m; j++) {
				maze[i][j] = Integer.parseInt(String.valueOf(toChar[j]));
			}
			
		}
		
		// 방문했는가? + (0,0)은 시작점이므로 방문
		visited = new boolean[n][m];
		visited[0][0] = true;
		bfs(0,0);
		
		// n, m에 도달하면 지나온 횟수 확인 가능
		System.out.println(maze[n-1][m-1]);
	}
	
	
	static void bfs(int startX, int startY) {

		// 다음 방문 좌표를 넣어줄 Queue 선언
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {startX, startY});
		
		while(!q.isEmpty()) {
			
			int cur[] = q.poll();
			int curX = cur[0];
			int curY = cur[1];
			
			// 4방향 탐색(상하좌우)
			for (int i = 0; i < 4; i++) {
				
				int nextX = curX + dx[i];
				int nextY = curY + dy[i];
				
				// 탐색하지 않을 조건 1) 범위 벗어남
				if(nextX<0 || nextY<0 || nextX>=n || nextY>=m) {
					continue;
				}
				
				// 탐색하지 않을 조건 2) 방문 불가한 곳(0)이거나, 방문
				if(maze[nextX][nextY]==0 || visited[nextX][nextY]) {
					continue;
				}
			
				// 두 조건 다 해당하지 않으면, 다음 탐색 경로로 적합
				q.add(new int[] {nextX, nextY});
				
				visited[nextX][nextY] = true;
				
				// 지나온 횟수의 의미로 +1;
				maze[nextX][nextY] = maze[curX][curY]+1;
			}
			
		}
		
	}
}