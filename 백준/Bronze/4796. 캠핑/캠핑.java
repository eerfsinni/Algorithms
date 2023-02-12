import java.util.Scanner;

// 백준 4796번

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = 1;
		while (true) {
			int l = sc.nextInt();
			int p = sc.nextInt();
			int v = sc.nextInt();

			if(l+p+v == 0) {
				break;
			}
			
			int days = (v/p)*l;
			int lasts = v - (v/p)*p;

			if (lasts > l) {
				days += l;
			}
			else {
				days += lasts;
			}
			System.out.println("Case " + t++ + ": " + days);
		}
	}
}
