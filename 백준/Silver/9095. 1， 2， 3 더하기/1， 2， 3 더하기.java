import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		int max = 0;
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		int dp[] = new int[max+1];
		
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		
		for (int i = 4; i < dp.length; i++) {
			dp[i] = dp[i-1] + dp[i-2] + dp[i-3]; 
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(dp[arr[i]]);
		}
		
		
	}
	
}
