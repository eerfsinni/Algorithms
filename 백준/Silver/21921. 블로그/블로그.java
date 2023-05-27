import java.util.*;
import java.io.*;

public class Main {

	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		// 블로그 시작하고 지난 일 수n
		int n = Integer.parseInt(st.nextToken());
		int visits[] = new int[n];

		// x일동안 가장 많이 들어온 방문자 수는?
		int x = Integer.parseInt(st.nextToken()); 

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			visits[i] = Integer.parseInt(st.nextToken());
		}

		// 방문자 구간합
		int sum[] = new int[n-x+1];

		// 초기값
		for (int i = 0; i < x; i++) {
			sum[0] += visits[i];
		}
		int maxV = sum[0];

		// 다음부터는
		for (int i = 1; i < sum.length; i++) {
			sum[i] = sum[i-1]-visits[i-1]+visits[i-1+x];

			// 최대값 구하기
			if (maxV < sum[i]) {
				maxV = sum[i];
			}
		}

		if(maxV==0) {
			bw.write("SAD");
		} else {
			int count = 0;
			for (int i = 0; i < sum.length; i++) {
				if(sum[i]==maxV) {
					count++;
				}
			}
			bw.write(String.valueOf(maxV) + '\n');
			bw.write(String.valueOf(count));
		}

		bw.flush();
		bw.close();

	}
}