import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int namu[] = new int[6];
		namu[0] = 0;

		for (int i = 1; i <= 5; i++) {
			namu[i] = Integer.parseInt(st.nextToken());
		}

		while (true) {

			for (int i = 1; i < 5; i++) {
				if(namu[i] > namu[i+1]) {
					int tmp = namu[i+1];
					namu[i+1] = namu[i];
					namu[i] = tmp;
					
					for (int j = 1; j <= 5; j++) {
						bw.write(String.valueOf(namu[j]) + " ");
					}
					bw.write("\n");
					
					bw.flush();
				}
			}

			boolean isEnd = true;
			for (int i = 1; i < 5; i++) {
				if(namu[i] > namu[i+1]) {
					isEnd = false;
					break;
				}
			}
			
			if(isEnd) break;
		}

	}
}
