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
		
		Arrays.sort(arr);
		
		int inputArr[] = new int[Integer.parseInt(br.readLine())];
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < inputArr.length; i++) {
			inputArr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < inputArr.length; i++) {
			int result = binarySearch(arr, 0, arr.length-1, inputArr[i]);
			if (result == -1) {
				System.out.println(0);
			} else {
				System.out.println(1);
			}
		}
		
	}
	
	public static int binarySearch(int[] arr, int start, int end, int key) {
		if (start > end) return -1;
		int mid = (start + end) / 2;
		
		if (arr[mid] == key) return mid;
		else if (arr[mid] > key) return binarySearch(arr, start, mid-1, key);
		else return binarySearch(arr, mid+1, end, key);
	}

}
