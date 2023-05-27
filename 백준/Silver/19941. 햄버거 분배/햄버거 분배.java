import java.util.*;
import java.io.*;

public class Main {

	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		// 문자열 길이
		int n = Integer.parseInt(st.nextToken());

		// 인접 거리
		int k = Integer.parseInt(st.nextToken());

		String line = br.readLine();
		char hp[] = line.toCharArray();
		int answer = 0;
		boolean find = false;

		// Greedy : '나' 기준, 인접거리 내에서 (왼) 가장 먼 것부터, (오) 가장 가까운 것부터

		for (int i = 0; i < hp.length; i++) {

			if(hp[i]=='P') {

				// 왼쪽 우선으로 탐색
				for (int j = k; j >= 1; j--) {

					// 범위 벗어나면 탐색 X 
					if(i-j<0) {
						continue;
					} else {

						// 만약 범위 내에서 햄버거를 찾으면
						if(hp[i-j]=='H') {
							hp[i-j]='X';	// 먹은 버거로 표시
							answer++;		// 먹은 인원 수 추가
							find = true;
							break;
						}
					}
				}

				// 왼쪽에서 찾았으면 find 초기화
				if(find) {
					find = false;

				} else {
					// 다음은 오른쪽으로 탐색

					for (int j = 1; j <= k; j++) {

						// 범위 벗어나면 탐색 X 
						if(i+j>=n) {
							continue;
						} else {


							// 만약 범위 내에서 햄버거를 찾으면
							if(hp[i+j]=='H') {
								hp[i+j]='X';	// 먹은 버거로 표시
								answer++;		// 먹은 인원 수 추가
								break;
							}
						}
					}

				}
			}

		}

		System.out.println(answer);
	}
}