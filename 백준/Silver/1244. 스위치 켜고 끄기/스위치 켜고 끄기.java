import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 스위치 개수

		int sw[] = new int[n+1]; // 스위치를 담을 배열

		for (int i = 1; i < sw.length; i++) {
			sw[i] = sc.nextInt();
		}

		int stuNum = sc.nextInt();

		for (int i = 0; i < stuNum; i++) {

			int gender = sc.nextInt();
			int num = sc.nextInt();

			// 남자인 경우
			if (gender == 1) {

				for (int j = 1; j < sw.length; j++) {
					if (j%num == 0 ) {
						sw[j]++;
						sw[j] = sw[j]%2;
					}
				}
			}
			// 여자인 경우
			if(gender == 2) {

				sw[num]++;
				sw[num] = sw[num]%2;

				for (int j = 1; num+j < sw.length && num-j >= 1; j++) {
					if (sw[num+j] == sw[num-j]) {
						sw[num+j]++;
						sw[num+j]= sw[num+j]%2;

						sw[num-j]++;
						sw[num-j]= sw[num-j]%2;
					}
					else {
						break;
					}
				}
			}

		}

		for (int i = 1; i < sw.length; i++) {
			System.out.print(sw[i] + " ");
			if (i%20 == 0) {
				System.out.println();
			}
		}

	} // main

} // class