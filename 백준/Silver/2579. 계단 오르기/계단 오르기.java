import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

		// 입출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int stairs[] = new int[n+1];
		int dp[] = new int[n+1];
		for (int i = 1; i <= n; i++) {
			stairs[i] = Integer.parseInt(br.readLine());
		}
		
		// 시작은 0
		dp[0] = 0;
		dp[1] = stairs[1];
		
		if(n >= 2) {
			dp[2] = stairs[1] + stairs[2];
		}
		
		for (int i = 3; i < dp.length; i++) {
			dp[i] = Math.max(dp[i-2], dp[i-3] + stairs[i-1]) + stairs[i];
			
		}
		
		
		System.out.println(dp[n]);
	}

}