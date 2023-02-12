import java.util.Scanner;

// 백준 5585

public class Main {

	public static void main(String[] args) {

		// 입력 받기
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		// 거슬러줘야 하는 가격은 얼마인가?
		int change = 1000 - a;

		// 잔돈의 갯수 : count
		int count = 0;

		// 거스름돈을 가장 적게 주려면? -> Greedy!		
		while (change / 500 != 0) {
			count++;
			change -= 500;
		}

		while (change / 100 != 0) {
			count++;
			change -= 100;
		}

		while (change / 50 != 0) {
			count++;
			change -= 50;
		}

		while (change / 10 != 0) {
			count++;
			change -= 10;
		}

		while (change / 5 != 0) {
			count++;
			change -= 5;
		}

		while (change != 0) {
			count++;
			change--;
		}

		System.out.println(count);
	}
}
