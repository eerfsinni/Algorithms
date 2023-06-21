import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		int[][] ground = new int[n][m];

		int min = 501;
		int max = -1;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());

			for (int j = 0; j < m; j++) {
				ground[i][j] = Integer.parseInt(st.nextToken());

				if(ground[i][j]>=max) max = ground[i][j];
				if(ground[i][j]<=min) min = ground[i][j];
			}
		}

		// 최소 시간
		int minTime = Integer.MAX_VALUE;

		// 최대 높이
		int maxHeight = min;

		for (int k = min; k <= max; k++) {

			// 모든 땅의 높이를 i로 맞춰본다.
			int[][] stable = new int[n][m];

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					stable[i][j] = ground[i][j]-k;
				}
			}

			// stable 배열에서 양수는 파내야 하는 것(2초 / minus), 음수는 놓아야 하는 것(1초 / plus)
			int minus = 0;
			int plus = 0;
			int needTime = 0;

			// 기준 인벤토리
			int inven = b;

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if(stable[i][j]>0) {
						minus += stable[i][j];
						inven += stable[i][j];
					}
					if(stable[i][j]<0) {
						plus += stable[i][j];
						inven += stable[i][j];
					}
				}
			}

			// 필요한 블럭 수가, 인벤토리에 있는 블럭 수보다 많으면 넘김
			if(inven < 0) continue;

			needTime = minus * 2 + plus * (-1);

			if(needTime <= minTime) {
				if(maxHeight <= k) {
					minTime = needTime;
					maxHeight = k;
				}
			}
		}

		bw.write(String.valueOf(minTime) + " " + String.valueOf(maxHeight));
		bw.flush();
		bw.close();

	}

}