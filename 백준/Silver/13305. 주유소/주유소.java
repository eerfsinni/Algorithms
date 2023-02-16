import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		// 입력 받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int distance[] = new int[n-1];
		int price[] = new int[n];

		StringTokenizer st1 = new StringTokenizer(br.readLine());
		for (int i = 0; i < distance.length; i++) {
			distance[i] = Integer.parseInt(st1.nextToken());
		}

		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for (int i = 0; i < price.length; i++) {
			price[i] = Integer.parseInt(st2.nextToken());

		}

		int min_price = price[0];
		long total = 0;

		for (int i = 0; i < price.length-1; i++) {

			if(price[i] < min_price) {
				min_price = price[i];
			}
			
			total += distance[i] * min_price;
		}
		
		System.out.println(total);
	}
}