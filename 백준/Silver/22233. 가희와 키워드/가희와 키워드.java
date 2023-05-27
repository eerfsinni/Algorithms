import java.util.*;
import java.io.*;

public class Main {

	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		// 초기 메모장 단어 받기
		Set<String> memo = new HashSet<>();
		for (int i = 0; i < n; i++) {
			memo.add(br.readLine());
		}
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine(), ",");
			
			// ','가 있을 때까지
			while(st.hasMoreTokens()) {
				
				// 들어온 단어가 메모장에 있는지를 판단
				String word = st.nextToken();
				
				// 있다면 제외
				if(memo.contains(word)) {
					memo.remove(word);
				}
			}
			
			// 글을 작성할 때마다 메모장의 단어 수 적어두기
			bw.write(String.valueOf(memo.size()) + '\n');
		}
		
		bw.flush();
		bw.close();
		
	}
}