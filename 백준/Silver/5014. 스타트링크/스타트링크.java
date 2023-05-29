import java.util.*;
import java.io.*;

public class Main {

	static int f;	// 총 층수
	static int s;	// 스타트링크의 위치
	static int g;	// 현재 층수
	static int u;	// 위로 u층
	static int d;	// 아래로 d층
	static int floor[]; // 지금 층이 최소 몇번으로 움직일 수 있는가?

	public static void main(String[] args) throws IOException {

		// 입출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		f = Integer.parseInt(st.nextToken());
		s = Integer.parseInt(st.nextToken());
		g = Integer.parseInt(st.nextToken());
		u = Integer.parseInt(st.nextToken());
		d = Integer.parseInt(st.nextToken());

		floor = new int[f+1];

		// BFS 탐색
		bfs(s, g);

		if(floor[g]==0) {
			bw.write("use the stairs");
		} else {
			bw.write(String.valueOf(floor[g]-1));
		}

		bw.flush();
		bw.close();
	}

	/*
	 	현재 층에서 도달 가능한 층들 BFS 탐색
	 	floor[]에는, 각 층에 도달할 수 있는 최소 경우의 수 입력
	 	 : 만약 방문한 floor[]의 값이 0보다 크면 pass
	 */
	static void bfs(int startF, int endF) {

		Queue<Integer> q = new LinkedList<>();
		q.add(startF);
		floor[startF] = 1;

		while(!q.isEmpty()) {

			int nowF = q.poll();

			// 0) 현재 층이 스타트링크가 있는 층이라면 탐색 중지
			if(nowF == endF) break;			

			// 1) 윗층(u)으로 탐색하는 Case
			// 최고 층 벗어나면 pass
			if(nowF + u <= f) {

				// 방문하고자 하는 층이 아직 방문 이력이 없으면
				if(floor[nowF+u] == 0) {
					floor[nowF+u] = floor[nowF] + 1; // 최소 버튼 수 추가
					q.add(nowF+u); // 탐색해야 할 층 추가
				}
			}

			// 2) 아랫층(d)으로 탐색하는 Case
			// 최저 층 벗어나면 pass
			if(nowF - d >= 1) {

				// 방문하고자 하는 층이 아직 방문 이력이 없으면
				if(floor[nowF-d] == 0) {
					floor[nowF-d] = floor[nowF] + 1; // 최소 버튼 수 추가
					q.add(nowF-d); // 탐색해야 할 층 추가
				}
			}
		}

	}

}