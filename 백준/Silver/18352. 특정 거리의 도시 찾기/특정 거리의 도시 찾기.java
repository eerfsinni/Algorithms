import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
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
	static boolean[] visit;
	static int dist[];

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		
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
			
			graph[a].add(new Node(b, 1));
		}
		
		dijkstra(x);
		
		int count = 0;
		for (int i = 1; i < dist.length; i++) {
			if(dist[i]==k) {
				count++;
				System.out.println(i);
			}
		}
		
		if (count==0) {
			System.out.println(-1);
		}

	}
	
	static void dijkstra(int start) {
		Queue<Node> q = new LinkedList<>();
		
		q.add(new Node(start, 0));
		dist[start] = 0;
		
		while(!q.isEmpty()) {
			
			Node now = q.poll();
			
			if (!visit[now.v]) {
                visit[now.v] = true;
            }
			
			for (Node next : graph[now.v]) {

                //방문하지 않았고, 현재 노드를 거쳐서 다른 노드로 이동하는 거리가 더 짧을 경우
                if (!visit[next.v] && dist[next.v] > now.cost + next.cost) {
                    dist[next.v] = now.cost + next.cost;
                    q.add(new Node(next.v, dist[next.v]));
                }
            }
		}
	}

}
