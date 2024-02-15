import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i-1; j++) {
				System.out.print(' ');
			}
			for (int k = 0; k < 2*(n-i+1) -1; k++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
	}
}
