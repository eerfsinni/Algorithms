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
			baguni.put(i, i);
		}
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int bag1 = Integer.parseInt(st.nextToken());
			int bag2 = Integer.parseInt(st.nextToken());
			
			int tmp = baguni.get(bag2);
			baguni.put(bag2, baguni.get(bag1));
			baguni.put(bag1, tmp);
		}
		
		for (int i = 1; i <= n; i++) {
			bw.write(baguni.get(i) + " ");
		}
		
		bw.flush();
		bw.close();
	}
}
