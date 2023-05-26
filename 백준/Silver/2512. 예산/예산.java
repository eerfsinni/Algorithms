import java.util.*;
import java.io.*;

public class Main {

	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 지방 수
		int n = Integer.parseInt(br.readLine());
		
		int provs[] = new int[n];
		
		int maxBudget = 0;
		
		// 각 지방별 예산 할당
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			provs[i] = Integer.parseInt(st.nextToken());
			if(maxBudget < provs[i]) {
				maxBudget = provs[i];
			}
		}
		
		// 총 예산
		int m = Integer.parseInt(br.readLine());
		
		// 지방별 예산의 총합이 총 예산에서 감당 가능하면 최대로
		int sum = 0;
		for (int i = 0; i < provs.length; i++) {
			sum += provs[i];
		}
		
		if (sum <= m) {
			System.out.println(maxBudget);
			return;
		}

		// 아니라면 최대 길이 찾아야 함
		// 오름차순 정렬 먼저
		Arrays.sort(provs);
		
		int end = provs[n-1];
		int start = 1;
		int mid = 0;
		
		// 이분탐색
		while(start<=end) {
			mid = (start+end)/2;
			
			sum = 0;
			for (int i = 0; i < provs.length; i++) {
				if(provs[i] < mid) {
					sum += provs[i];
				} else {
					sum += mid;
				}
			}
			
			if(sum <= m) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		
		System.out.println(end);
		
	}
}