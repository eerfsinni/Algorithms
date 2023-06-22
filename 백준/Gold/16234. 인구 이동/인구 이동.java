import java.util.*;
import java.io.*;

public class Main {

	static int[][] countries;
	static boolean[][] visited;
	static boolean isMove;

	static int dx[] = {0, 1, 0, -1}; // 우, 하, 좌, 상
	static int dy[] = {1, 0, -1, 0}; // 우, 하, 좌, 상

	static int n;
	static int l;
	static int r;

	static void bfs(int startX, int startY) {

		Queue<int[]> q = new LinkedList<>();
		ArrayList<int[]> saved = new ArrayList<>();

		q.add(new int[] {startX, startY});
		visited[startX][startY] = true;
		saved.add(new int[] {startX, startY});

		int sum = countries[startX][startY];
		int count = 1;

		while(!q.isEmpty()) {
			int cur[] = q.poll();
			int curX = cur[0];
			int curY = cur[1];

			// 4방향 탐색
			for (int i = 0; i < 4; i++) {
				int nextX = curX + dx[i];
				int nextY = curY + dy[i];

				// 탐색하지 않을 경우 1) 탐색 범위를 벗어나는 경우
				if(nextX<0 || nextY<0 || nextX>=n || nextY>=n) {
					continue;
				}

				// 탐색하지 않을 경우 2) 인구 차가 l과 r 사이에 없는 경우
				if(Math.abs(countries[curX][curY]-countries[nextX][nextY])<l ||
						Math.abs(countries[curX][curY]-countries[nextX][nextY])>r) continue;

				// 탐색하지 않을 경우 3) 이미 방문한 경우
				if(visited[nextX][nextY]) continue;

				// 탐색
				q.add(new int[] {nextX, nextY});
				visited[nextX][nextY]=true;
				saved.add(new int[] {nextX, nextY});

				sum += countries[nextX][nextY];
				count++;
				isMove = true;
			} 
		}

		for (int i = 0; i < saved.size(); i++) {
			countries[saved.get(i)[0]][saved.get(i)[1]] = sum/count;
		}

	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		l = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());

		// 인구 이동 경과일(정답)
		int days = 0;

		// 나라별 인구 입력
		countries = new int[n][n];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				countries[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		while(true) {

			visited = new boolean[n][n];
			isMove = false;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if(!visited[i][j]) {
						bfs(i,j);
					}
				}
			}

			if(!isMove) break;

			days++;

		}

		System.out.println(days);
	}
}
