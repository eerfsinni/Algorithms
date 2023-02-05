import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int v = sc.nextInt();
		
		dfsCheck = new boolean[n+1];
		bfsCheck = new boolean[n+1];

		for(int i=0;i<=n;i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		for (int i = 0; i < m; i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			graph.get(a).add(b);
			graph.get(b).add(a);
			
		}
		
		for (int i = 0; i <= n; i++) {
			Collections.sort(graph.get(i));
		}
		
		dfs(v);
		System.out.println();
		bfs(v);
		
		
		
	} // class
	
	static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
	
	static boolean dfsCheck[];
	static boolean bfsCheck[];
	static Queue<Integer> q = new LinkedList<>();
	
	static void dfs(int node) {
		
		dfsCheck[node] = true;
		System.out.print(node + " ");
		
		for (int to : graph.get(node)) {
			
			if(!dfsCheck[to]) {
				dfs(to);
			}
			
		}
	}
	
	static void bfs(int start) {
		
		q.offer(start);
		bfsCheck[start] = true;
		
		while(!q.isEmpty()) {
			
			int from = q.poll();
			System.out.print(from + " ");
			
			for (int to : graph.get(from)) {
				
				if (!bfsCheck[to]) {
					bfsCheck[to] = true;
					q.offer(to);
				}
				
			}
			
			
		}
		
	}
	
} // main