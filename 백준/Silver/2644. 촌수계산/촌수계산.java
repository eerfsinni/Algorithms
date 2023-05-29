import java.util.*;
import java.io.*;

public class Main {

	static int n; // 전체 인원 수
	static int a; // 촌수 계산할 인원 1
	static int b; // 촌수 계산할 인원 2
	static int m; // 주어질 관계의 수
	static ArrayList<ArrayList<Integer>> relative; // 관계 그래프
	static int check[]; // bfs를 위한 체크배열(촌수)

	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		n = Integer.parseInt(br.readLine());
		check = new int[n+1];

		StringTokenizer st = new StringTokenizer(br.readLine());
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());

		m = Integer.parseInt(br.readLine());

		// 관계 입력
		relative = new ArrayList<>();
		for (int i = 0; i < n+1; i++) {
			relative.add(new ArrayList<Integer>());
		}

		for (int i = 0; i < m; i++) {

			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			// ex) 부모->나, 나->부모 모두 연결된 1촌이므로, 양방향 그래프 형성
			relative.get(x).add(y);
			relative.get(y).add(x);
		}

		System.out.println(bfs(a,b));

	}

	static int bfs(int p1, int p2) {

		Queue<Integer> q = new LinkedList<>();
		q.add(p1);
		check[p1] = 0;

		while(!q.isEmpty()) {

			int cur = q.poll();

			for (int i = 0; i < relative.get(cur).size(); i++) {
				
				int next = relative.get(cur).get(i);
				
				if(next==p2) {
					check[next] = check[cur] + 1;
					return check[p2];
				}
				
				if(check[next]==0) {
					check[next] = check[cur] + 1;
					q.add(next);
				}
			}

		}
		
		return -1;

	}

}