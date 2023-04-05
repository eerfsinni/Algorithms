import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		// 배열의 크기 n 입력받기
		n = Integer.parseInt(br.readLine());

		// n x n 2차원 배열 만들기
		arr = new int[n][n];


		// 2차원 배열 값 입력받기(최댓값 같이 조사)
		int max = 0;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());

			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(max < arr[i][j]) {
					max = arr[i][j];
				}
			}
		}

		// 최대 안전영역 개수
		int maxArea = 0;	
		
		// 높이를 하나씩 올리면서 찾아봄
		for(int h = 0; h <= max; h++) {
			dfsCheck = new boolean[n][n];

			// 해당 높이에서의 안전영역 개수
			int count = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					// 안전영역 탐색(물에 안잠김 + 내가 아직 방문 안한 곳)
					if(arr[i][j] > h && !dfsCheck[i][j]) {
						count += dfs(i, j, h);
					}
				}
			}
			
			if(maxArea < count) {
				maxArea = count;
			}
		}
		
		System.out.println(maxArea);

	}

	// 배열의 크기와 2차원 배열
	static int n;
	static int[][] arr;

	// 탐색 방향
	static int dx[] = {1, 0, -1, 0}; // 하, 좌, 상, 우 
	static int dy[] = {0, -1, 0, 1};

	// dfsCheck
	static boolean dfsCheck[][];

	static int dfs(int x, int y, int h) {
		dfsCheck[x][y] = true;

		// 4방향 탐색
		for (int i = 0; i < 4; i++) {

			int nx = x + dx[i];
			int ny = y + dy[i];

			// 탐색하려는 좌표가 탐색 불가한 곳이면
			if(nx<0 || nx>n-1 || ny<0 || ny>n-1) {
				continue; // 이번 case 무시
			}

			// 내가 가려는 좌표가 이미 탐색되었으면
			if(dfsCheck[nx][ny]) {
				continue; // 이번 case무시
			}

			// 내가 가려는 좌표가 제시된 높이보다 높으면 안전하니까
			if(arr[nx][ny] > h) {
				dfs(nx, ny, h); // 탐색
			}
		}

		// 탐색 끝내면 해당 지역(및 인접지역)은 안전하기 때문에
		return 1;
	}

}
