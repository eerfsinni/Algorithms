import java.util.*;
import java.io.*;

public class Main {

	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			ArrayList<Integer> arr = new ArrayList<>();

			int v1 = Integer.parseInt(st.nextToken());
			int v2 = Integer.parseInt(st.nextToken());
			int v3 = Integer.parseInt(st.nextToken());

			// 탈출 조건
			if(v1 + v2 + v3 == 0) {
				return;
			}

			// 세 변의 길이가 같은 경우 : Equilateral
			if(v1==v2 && v2==v3) {
				System.out.println("Equilateral");

				// 아닌 경우
			} else {
				// 길이가 긴 순으로 정렬
				arr.add(v1); arr.add(v2); arr.add(v3);
				Collections.sort(arr, Collections.reverseOrder());

				// 가장 길이가 긴 변 >= 나머지 두 변의 길이가 같은 경우 : Invalid
				if(arr.get(0) >= arr.get(1) + arr.get(2)) {
					System.out.println("Invalid");

					// 두 변의 길이가 같고, 다른 한 변의 길이가 다른 경우 : Isosceles
				} else {
					if(arr.get(0).equals(arr.get(1)) || arr.get(1).equals(arr.get(2))) {
						System.out.println("Isosceles");

						// 다 아닌 경우 : Scalene
					} else {
						System.out.println("Scalene");
					}
				}
			}
		}
	}
}