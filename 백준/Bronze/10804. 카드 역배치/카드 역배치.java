import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		Map<Integer, Integer> cards = new HashMap<>();
		for (int i = 1; i <= 20; i++) {
			cards.put(i, i);
		}
		
		for (int i = 0; i < 10; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			// 역순 정렬 카드가 짝수개인 경우
			if((end - start + 1)%2 == 0) {
				
				for (int j = 0; j < (end-start)/2+1; j++) {
					int tmp = cards.get(end - j);
					cards.put(end-j, cards.get(start+j));
					cards.put(start+j, tmp);
				}
				
			// 역순 정렬 카드가 홀수개인 경우	
			} else {
				
				for (int j = 0; j < (end-start)/2; j++) {
					int tmp = cards.get(end - j);
					cards.put(end-j, cards.get(start+j));
					cards.put(start+j, tmp);
				}
				
			}
		}

		for (int i = 1; i <= 20; i++) {
			bw.write(String.valueOf(cards.get(i)) + " ");
		}
		
		bw.flush();
		bw.close();
	}
}
