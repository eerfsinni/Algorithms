import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	// 변수 설정
	static int r;
	static int c;
	static int[][] arr;
	static int count = 0;
	static int answer = 0;

	static int dx[] = {1, 0, -1, 0}; // 하, 좌, 상, 우 
	static int dy[] = {0, -1, 0, 1};

	static boolean dfsCheck[] = new boolean[26];

	static void dfs(int x, int y, int count) {

		// 내가 도착한 곳이 이미 만난 알파벳이라면?
		if(dfsCheck[arr[x][y]]) {
			
			// 최대거리 갱신
			if(answer < count) {
				answer = count;
			}
			return;
			
		} else {
			
			// 내가 도착한 곳을 true로
			dfsCheck[arr[x][y]] = true;

			// 4방향 탐색
			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];

				// 탐색 불가한 곳은 pass
				if(nx<0 || nx>r-1 || ny<0 || ny>c-1) {
					continue;
				}

				// 탐색 가능하다면 계속 go
				dfs(nx, ny, count+1);
			}
			
			// 다른 방향으로 뻗어가기 위한 방문 초기화(false)
			dfsCheck[arr[x][y]] = false;
		}

	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());

		arr = new int[r][c];

		for (int i = 0; i < r; i++) {
			String alphabet = br.readLine();

			for (int j = 0; j < c; j++) {
				arr[i][j] = alphabet.charAt(j) - 'A';
			}
		}

		dfs(0, 0, 0);
		System.out.println(answer);

	}


}
