import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		
		Map<Integer, Integer> cup = new HashMap<>();
		
		for (int i = 1; i <= 3; i++) {
			cup.put(i, i);
		}
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int c1 = Integer.parseInt(st.nextToken());
			int c2 = Integer.parseInt(st.nextToken());
			
			int tmp = cup.get(c2);
			cup.put(c2, cup.get(c1));
			cup.put(c1, tmp);
		}
		
		for (int i = 1; i <= 3; i++) {
			if(cup.get(i)==1) {
				bw.write(String.valueOf(i));
			}
		}
		
		bw.flush();
		bw.close();
	}
}
