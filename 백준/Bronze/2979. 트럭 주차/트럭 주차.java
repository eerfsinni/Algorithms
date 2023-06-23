import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		int parking[] = new int[101];
		int sum = 0;
		parking[0] = 0;
		
		for (int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			for (int j = start; j < end; j++) {
				parking[j]++;
			}
		}
		
		for (int i = 1; i <= 100; i++) {
			if(parking[i]==1) sum += a;
			else if(parking[i]==2) sum += b*2;
			else if(parking[i]==3) sum += c*3;
			else;
		}
		
		System.out.println(sum);
	}
}
