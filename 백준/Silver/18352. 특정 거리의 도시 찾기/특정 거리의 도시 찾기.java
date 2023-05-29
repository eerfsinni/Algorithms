import java.util.*;
import java.io.*;

public class Main {

	static int n;	// 노드 수
	static int m;	// 간선 수
	static int k;	// 거리 정보
	static int x;	// 출발 도시 번호
	static ArrayList<Node> graph[]; // 도시 관계
	static int dist[]; // 거리 담을 배열
	static boolean visit[]; // 방문여부
	
	static class Node{
		int v;		// 정점
		int cost;	// 거리
		
		public Node(int v, int cost) {
			this.v = v;
			this.cost = cost;
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		x = Integer.parseInt(st.nextToken());
	
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
		
		int count=0;
		for (int i = 1; i < dist.length; i++) {
			if(dist[i]==k) {
				count++;
				System.out.println(i);
			}
		}
		
		if(count==0) {
			System.out.println(-1);
		}
	}
	
	static void dijkstra(int start) {
		
		Queue<Node> q = new LinkedList<>();
		
		q.add(new Node(start, 0));
		dist[start] = 0;
		
		while(!q.isEmpty()) {
			
			Node cur = q.poll();
			
			// 아직 방문 안했으면 방문 처리
			if(!visit[cur.v]) {
				visit[cur.v] = true;
			}
			
			// 다음 노드들 순회
			for (Node next : graph[cur.v]) {

                //방문하지 않았고, 현재 노드를 거쳐서 다른 노드로 이동하는 거리가 더 짧을 경우
                if (!visit[next.v] && dist[next.v] > cur.cost + next.cost) {
                    dist[next.v] = cur.cost + next.cost;
                    q.add(new Node(next.v, dist[next.v]));
                }
			
			}
		}
	}
}