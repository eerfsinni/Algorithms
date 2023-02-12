import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// n명의 대기 시간을 받는 배열 선언
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		// 각각의 대기시간을 입력
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		// 대기시간의 총합 : sum;
		int sum = 0;
		
		// 가장 최단 시간을 뽑는 방법? -> Greedy!
		
		// 시간이 적게 걸리는 사람부터 ATM기를 사용하면 최단시간
		// --> 오름차순
		Arrays.sort(arr);
		

		// 최단시간의 합 구하기
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i] * (arr.length - i);
		}

		System.out.println(sum);
	}

}