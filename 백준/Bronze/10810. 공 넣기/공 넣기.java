import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		Map<Integer, Integer> baguni = new HashMap<>();
		
		for (int i = 1; i <= n; i++) {
			baguni.put(i, 0);
		}
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int ballNum = Integer.parseInt(st.nextToken());
			
			for (int j = start; j <= end; j++) {
				baguni.put(j, ballNum);
			}
		}
		
		for (int i = 1; i <= n; i++) {
			bw.write(baguni.get(i) + " ");
		}
		
		bw.flush();
		bw.close();
	}
}
