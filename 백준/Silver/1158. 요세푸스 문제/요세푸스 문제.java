import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 사람 수
		int k = sc.nextInt(); // 제거하는 순서

		int count = 1;		  // 순번

		Queue<Integer> cQueue = new LinkedList<>();

		for (int i = 0; i < n; i++) {
			cQueue.offer(count++);
		}

		System.out.print("<");
		while (cQueue.size() > 1) {

			for (int i = 0; i < k-1; i++) {
				int a = cQueue.poll();
				cQueue.offer(a);
			}
			System.out.print(cQueue.poll()+ ", ");
		}
		System.out.print(cQueue.poll());
		System.out.print(">");			

	} // main
} // class