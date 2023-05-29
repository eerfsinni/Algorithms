import java.util.*;
import java.io.*;

public class Main {

	static int n; // 수빈이의 위치
	static int k; // 동생의 위치
	static int where[] = new int[1000001];

	public static void main(String[] args) throws IOException {

		// 입출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		bfs(n, k);
		
		bw.write(String.valueOf(where[k]-1));
		bw.flush();
		bw.close();
	}

	/*
	 	수빈이의 위치부터 동생의 위치까지 도달하는 bfs 탐색
	 	 + 각 위치별로 최소 몇 번으로 도달할 수 있는지 입력
	 */
	
	static void bfs(int subin, int brother) {
		
		Queue<Integer> q = new LinkedList<>();
		q.add(subin);
		where[subin] = 1;
		
		while(!q.isEmpty()) {
			
			int cur = q.poll();
			
			if(cur == k) {
				break;
			}
			
			// 왼쪽으로 가는 Case
			if(cur-1 >= 0) {
				if(where[cur-1]==0) {
					q.add(cur-1);
					where[cur-1] = where[cur] + 1;
				}
			}
			
			// 오른쪽으로 가는 Case
			if(cur+1 < where.length) {
				if(where[cur+1]==0) {
					q.add(cur+1);
					where[cur+1] = where[cur] + 1;
				}
			}
			
			// 순간이동하는 Case
			if(cur*2 < where.length) {
				if(where[cur*2]==0) {
					q.add(cur*2);
					where[cur*2] = where[cur] + 1;
				}
			}
		}
		
	}


}