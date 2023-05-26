import java.util.*;
import java.io.*;

public class Main {

	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int m = Integer.parseInt(st.nextToken());
		ArrayList<Integer> S = new ArrayList<>();

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());

			String cmd = st.nextToken();

			if (cmd.equals("all")) {
				S.clear();

				for (int j = 1; j <= 20; j++) {
					S.add(j);
				}

			} else if (cmd.equals("empty")) { // 비우기
				S.clear();
				
			} else {

				int x = Integer.parseInt(st.nextToken());
				if (cmd.equals("add")) { // S에서 x를 추가, 이미 있으면 무시

					if(S.indexOf(x)==-1) {
						S.add(x);
					} else {
						continue;
					}

				} else if (cmd.equals("remove")) { // S에서 x를 제거, 없으면 무시

					if(S.indexOf(x)==-1) {
						continue;
					} else {
						S.remove(S.indexOf(x));
					}


				} else if (cmd.equals("check")) { // 해당 값이 있는지 체크

					if(S.contains(x)) {
						bw.write("1" + '\n');
					} else {
						bw.write("0" + '\n');
					}

				} else if (cmd.equals("toggle")) { // S에 x가 있으면 x를 제거, 없으면 추가

					if(S.indexOf(x)==-1) {
						S.add(x);
					} else {
						S.remove(S.indexOf(x));
					}

				} 
			}
		}
		
		bw.flush();
		bw.close();
	}
}