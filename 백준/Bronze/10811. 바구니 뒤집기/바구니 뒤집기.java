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
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			// 역순 정렬 바구니가 짝수개인 경우
			if((end - start + 1)%2 == 0) {
				
				for (int j = 0; j < (end-start)/2+1; j++) {
					int tmp = baguni.get(end - j);
					baguni.put(end-j, baguni.get(start+j));
					baguni.put(start+j, tmp);
				}
				
			// 역순 정렬 바구니가 홀수개인 경우	
			} else {
				
				for (int j = 0; j < (end-start)/2; j++) {
					int tmp = baguni.get(end - j);
					baguni.put(end-j, baguni.get(start+j));
					baguni.put(start+j, tmp);
				}
				
			}
		}

		for (int i = 1; i <= n; i++) {
			bw.write(String.valueOf(baguni.get(i)) + " ");
		}
		
		bw.flush();
		bw.close();
	}
}
