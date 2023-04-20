import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	static class Node {
		int v;
		int cost;

		public Node(int v, int cost) {
			this.v = v;
			this.cost = cost;
		}
	}

	static ArrayList<Node> graph[];
	static boolean visit[];
	static int dist[];

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());

		graph = new ArrayList[n+1];
		dist = new int[n+1];
		visit = new boolean[n+1];

		for (int i = 1; i <= n; i++) {
			graph[i] = new ArrayList<>();
			dist[i] = Integer.MAX_VALUE;
		}

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

			graph[a].add(new Node(b, c));
		}

		st = new StringTokenizer(br.readLine());
		int start = Integer.parseInt(st.nextToken());
		int end = Integer.parseInt(st.nextToken());

		bw.write(dijkstra(start, end) + "\n");
		bw.flush();
		bw.close();
		br.close();

	}

	static int dijkstra(int start, int end) {

		PriorityQueue<Node> q = new PriorityQueue<>((o1, o2) -> o1.cost - o2.cost);

		q.offer(new Node(start, 0));
		dist[start] = 0;

		while(!q.isEmpty()) {

			Node now = q.poll();

			if (!visit[now.v]) {
				visit[now.v] = true;

				for (Node next : graph[now.v]) {

					//방문하지 않았고, 현재 노드를 거쳐서 다른 노드로 이동하는 거리가 더 짧을 경우
					if (!visit[next.v] && dist[next.v] > dist[now.v] + next.cost) {
						dist[next.v] = dist[now.v] + next.cost;
						q.offer(new Node(next.v, dist[next.v]));
					}
				}
			}
		}

		return dist[end];
	}

}