import java.util.*;

class Solution {
    
    ArrayList<Node>[] graph;
    int[] distance;
    
    public int solution(int N, int[][] road, int K) {
        int answer = 0;
        
        // 인접 리스트
        graph = new ArrayList[N+1];
        distance = new int[N+1];
        
        for (int i=1; i<=N; i++) {
            graph[i] = new ArrayList<>();
            distance[i] = Integer.MAX_VALUE;
        }
        
        for (int i=0; i<road.length; i++) {
            int start = road[i][0];
            int end = road[i][1];
            int cost = road[i][2];
            graph[start].add(new Node(end, cost));
            graph[end].add(new Node(start, cost));
        }
        
        dijkstra(1);
        for (int i=1; i<=N; i++) {
            if (distance[i] <= K) {
                answer++;
            }
        }
        
        return answer;
    }
    
    public void dijkstra(int start) {
        PriorityQueue<Node> queue = new PriorityQueue<>((o1, o2) -> o1.cost - o2.cost);
        queue.add(new Node(start, 0));
        distance[start] = 0;
        
        while (!queue.isEmpty()) {
            Node now = queue.poll();
            
            if (distance[now.v] < now.cost) {
                continue;
            }
            
            for (Node next : graph[now.v]) {
                if (distance[next.v] > distance[now.v] + next.cost) {
                    distance[next.v] = distance[now.v] + next.cost;
                    queue.add(new Node(next.v, distance[next.v]));
                }
            }
        }
    }
}

class Node {
    int v;
    int cost;
    Node(int v, int cost) {
        this.v = v;
        this.cost = cost;
    }
}