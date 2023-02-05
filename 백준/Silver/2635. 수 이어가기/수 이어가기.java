import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int count = 0;
		int maxCount = 0;
		int maxNum = 0;

		int a = sc.nextInt();

		int n1 = a;

		for (int i = a; i > 0; i--) {

			count = 1;
			int n2 = i;
			count++;

			int n3 = n1-n2;
			count++;

			while (true) {

				// 0 이상이면 계속
				if(n2 - n3 >= 0) {
					int temp = n2;
					n2 = n3;
					n3 = temp - n3;
					count++;
				}
				// 음수가 나오면
				else {
					if (count >= maxCount) {
						maxCount = count;
						maxNum = i;
					}
					break;
				}

			} // while 뒤 판단


		}

		System.out.println(maxCount);
		
		System.out.print(n1 + " " + maxNum + " ");
		while (true) {
			
			if (n1-maxNum < 0) {
				break;
			}
			
			System.out.print(n1 - maxNum + " ");
			
			int tempNum = n1;
			n1 = maxNum;
			maxNum = tempNum-n1;
			
		}

	} // main
} // class