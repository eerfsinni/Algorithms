import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int arr[] = new int[Integer.parseInt(br.readLine())];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int inputArr[] = new int[Integer.parseInt(br.readLine())];
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < inputArr.length; i++) {
			inputArr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		for (int i = 0; i < inputArr.length; i++) {
			int result = Arrays.binarySearch(arr, inputArr[i]);
			if (result>= 0) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}
		
	}

}
