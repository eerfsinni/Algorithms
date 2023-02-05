import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		int temps[] = new int[n];
		
		int k = sc.nextInt();
		
		// 온도 넣기
		for (int i = 0; i < temps.length; i++) {
			temps[i] = sc.nextInt();
		}
		
		
		// 판단
		// 최댓값 초기화
		int max = 0;
		for (int i = 0; i < k; i++) {
			max += temps[i];
		}
		
		
		// 비교하기
		
		for (int i = 0; i < n-k+1; i++) {
			int sum = 0;
			for (int j = 0; j < k; j++) {
				sum += temps[j+i];
			}
			
			if (sum > max) {
				max = sum;
			}
			
			sum = 0;
		}
		
		
		
		System.out.println(max);
		
	} // main
} // class