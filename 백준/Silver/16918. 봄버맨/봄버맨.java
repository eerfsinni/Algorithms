import java.util.*;
import java.io.*;

public class Main {

	static int[][] field;
	static int r;
	static int c;
	static int n;
	static int dx[] = {-1, 1, 0, 0}; // 상 하 좌 우
	static int dy[] = {0, 0, -1, 1}; // 상 하 좌 우

	// 모든 곳에 폭탄 설치
	static void bomb() {
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				field[i][j]++;
			}
		}
	}

	// 3초 지난 폭탄 폭발
	static void explode() {
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if(field[i][j]>=3) {

					field[i][j] = 0;

					// 4방향 탐색
					for (int k = 0; k < 4; k++) {
						int nx = i + dx[k];
						int ny = j + dy[k];

						if(nx<0 || nx>=r || ny<0 || ny>=c) continue;

						if(field[nx][ny]>=3) continue;

						field[nx][ny]=0;
					}
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());

		field = new int[r][c];

		for (int i = 0; i < r; i++) {
			String line = br.readLine();
			char[] toChar = line.toCharArray();

			for (int j = 0; j < c; j++) {
				if(toChar[j] == '.') {
					field[i][j] = 0;
				} else {
					field[i][j] = 1;
				}
			}

		}

		if(n>1) {
			for (int i = 1; i<n ; i++) {

				if(i%2==1) {
					bomb();
				} else {
					bomb();
					explode();
				}
			}
		}

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if(field[i][j]>0) {
					bw.write("O");
				} else {
					bw.write(".");
				}
			}
			bw.write("\n");
		}

		bw.flush();
		bw.close();
	}

}