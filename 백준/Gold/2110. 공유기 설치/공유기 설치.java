import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		int house[] = new int[n];
		
		for (int i = 0; i < house.length; i++) {
			house[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(house);
		
		int low = 1;
		int high = house[n-1] - house[0];
		int answer = 0;
		
		while(low <= high) {
			int mid = (low + high) / 2;
			int start = house[0];
			int count = 1;
			int distance = 0;

			
			for (int i = 0; i < house.length; i++) {
				distance = house[i] - start;
				if (distance >= mid) {
					count++;
					start = house[i];
				}
			}
			
			if (count >= c) {
				answer = mid;
				low = mid + 1;
			} else {
				high = mid - 1;
			}
			
		}
		
		System.out.println(answer);
	}

}