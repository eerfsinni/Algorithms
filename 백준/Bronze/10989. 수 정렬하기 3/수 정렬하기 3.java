import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		// Counting Sort
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());

		// 기본 배열
		int arr[] = new int[n];
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		
		// Counting 배열
		int counting[] = new int[max+1];
		for (int i = 0; i < arr.length; i++) {
			counting[arr[i]]++;
		}
		
		// 누적합
		for (int i = 1; i < counting.length; i++) {
			counting[i] += counting[i-1];
		}
		
		// result 배열
		int result[] = new int[n];
		for (int i = arr.length-1; i >=0; i--) {
			int val = arr[i];
			counting[val]--;
			result[counting[val]] = val;
		}
		
		// 결과 출력
		for (int i = 0; i < result.length; i++) {
			sb.append(result[i]).append('\n');
		}
		
		System.out.println(sb);
		
	}

}
