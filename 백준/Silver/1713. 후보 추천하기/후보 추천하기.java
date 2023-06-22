import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int rcm = Integer.parseInt(br.readLine());

		// 추천 순서(오래된 순)을 판단할 List
		ArrayList<String> rcmOrder = new ArrayList<>();

		// 후보별 추천 수를 담을 Map
		Map<String, Integer> rcmCount = new HashMap<>();

		// 추천인에 따른 판단
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < rcm; i++) {

			String rcmMan = st.nextToken();

			// 새로운 후보는 무조건 사진틀에 들어감
			Integer count = rcmCount.getOrDefault(rcmMan, 0);
			rcmCount.put(rcmMan, count+1);

			// 이미 사진틀에 있는 후보인가?
			if (rcmOrder.contains(rcmMan)) continue;

			// 사진틀에 들어갈 여유가 있는가?
			if (rcmOrder.size() < n) {
				rcmOrder.add(rcmMan);

			// 여유가 없다면, 추천 수가 가장 적은 학생을 삭제
			} else {
				// 최소 추천 수 조회
				int rcmMin = 1001;
				for (int j = 0; j < n; j++) {
					if(rcmCount.get(rcmOrder.get(j)) < rcmMin) {
						rcmMin = rcmCount.get(rcmOrder.get(j));
					} 
				}

				// 최소 추천인 사진 삭제 및 추천 수 초기화
				for (int j = 0; j < n; j++) {
					if(rcmCount.get(rcmOrder.get(j)) == rcmMin) {
						rcmCount.remove(rcmOrder.get(j));
						rcmOrder.remove(j);
						break;
					}
				}

				// 새로운 후보 등재
				rcmOrder.add(rcmMan);
			}

		}

		ArrayList<Integer> answer = new ArrayList<>();

		for (int i = 0; i < rcmOrder.size(); i++) {
			answer.add(Integer.parseInt(rcmOrder.get(i)));
		}
		
		Collections.sort(answer);

		for (int i = 0; i < answer.size(); i++) {
			bw.write(String.valueOf(answer.get(i)) + " ");
		}
		
		bw.flush();
		bw.close();

	}

}