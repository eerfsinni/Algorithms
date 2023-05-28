import java.util.*;
import java.io.*;

public class Main {

	static int village[][];
	static int n;
	static boolean visited[][];
	static ArrayList<Integer> answer;

	// 상하좌우
	static int dx[] = {-1, 1, 0, 0};
	static int dy[] = {0, 0, -1, 1};

	public static void main(String args[]) throws IOException {

		// 입출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		n = Integer.parseInt(br.readLine());
		village = new int[n][n];
		answer = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			String line = br.readLine();
			char toChar[] = line.toCharArray();

			for (int j = 0; j < n; j++) {
				village[i][j] = toChar[j]-'0';
			}
		}
		
		// 체크배열
		visited = new boolean[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(village[i][j]==1 && !visited[i][j]) {
					bfs(i, j);
				}
			}
		}

		// 오름차순 정렬 + 단지 수 + 정답 출력
		Collections.sort(answer);
		bw.write(String.valueOf(answer.size()) + '\n');
		
		for (int i = 0; i < answer.size(); i++) {
			bw.write(String.valueOf(answer.get(i)) + '\n');
		}

		bw.flush();
		bw.close();
	}
	
	static void bfs(int startX, int startY) {
		
		int count = 1;
		
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {startX, startY});
		visited[startX][startY] = true;
		
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
				
				// 탐색하지 않을 경우 2) 0이거나, 이미 방문한 경우
				if(village[nextX][nextY]==0 || visited[nextX][nextY]==true) {
					continue;
				}
				
				// 둘 다 아니라면 탐색
				q.add(new int[] {nextX, nextY});
				visited[nextX][nextY]=true;
				
				// 카운트 증가
				count++;
			} 
		}

		// 완료된 count를 list에 추가
		answer.add(count);
	}
}