import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 후보의 수
		int n = Integer.parseInt(br.readLine());

		int cands[] = new int[n+1];
		cands[0] = 0;
		int vote = 0;

		for (int i = 1; i <=n; i++) {
			cands[i] = Integer.parseInt(br.readLine());
		}

		// 단독출마라면
		if(n==1) {
			System.out.println(0);
		}

		// 아니라면
		else {
			
			while (true) {

				// 종료 조건 : 다솜이의 득표(cands[0])가 가장 많을 때
				boolean isEnd = true;
				for (int i = 2; i <= n; i++) {
					if(cands[1] <= cands[i]) {
						isEnd = false;
						break;
					}
				}
				if(isEnd) break;

				// 다솜이 제외 표가 가장 많은 사람부터 하나씩 가져감
				int max = cands[2];
				int maxNum = 0;
				for (int i = 2; i <= n; i++) {
					if(max<=cands[i]) {
						max = cands[i];
						maxNum = i;
					} 
				}

				// 다솜 득표 추가 및 해당 후보 득표 감소
				cands[1]++;
				cands[maxNum]--;
				vote++;
			}
			
			System.out.println(vote);
		}
		
	}
}
