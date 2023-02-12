import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Comparator;

// 백준 1931번

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 회의의 개수
		int n = Integer.parseInt(br.readLine());

		// n개의 회의에 각각 시간을 2개씩(시작, 종료) 담기
		int[][] times = new int[n][2];


		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			times[i][0] = Integer.parseInt(st.nextToken()); // 시작 시간
			times[i][1] = Integer.parseInt(st.nextToken()); // 종료 시간
		}

		// 2차원 배열의 정렬
		Arrays.sort(times, new Comparator<int[]>() {

			public int compare(int[] o1, int[] o2) {

				if(o1[1] == o2[1]) {		// 종료 시간이 같다면
					return o1[0] - o2[0];   // 시작 시간이 빠른 것부터 정렬(오름차순)
				}
				return o1[1] - o2[1];		// 기본적으로는 종료 시간 순으로 정렬(오름차순)
			}
		});

		int answer = 0;			// 정답
		int prev_end = 0;		// 이전 회의가 끝난 시간

		for (int i = 0; i < n; i++) {

			if(prev_end <= times[i][0]) {   // 이전 회의가 끝난 시간 <= 이번 회의가 시작한 시간이라면,
				prev_end = times[i][1];		// (이번 회의 선택) -> prev_end = 이번 회의가 끝난 시간
				answer++;					// (이번 회의를 선택했으므로) 정답++;
			}
		}

		System.out.println(answer);

	}

}


