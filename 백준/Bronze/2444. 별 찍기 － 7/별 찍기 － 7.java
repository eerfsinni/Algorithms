import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int depth = Integer.parseInt(br.readLine());

        // 상단
        for (int i = depth - 1; i > 0; i--) {
            System.out.print(" ".repeat(i));
            System.out.print("*".repeat((depth - i)*2 -1));
            System.out.println();
        }

        // 중단
        System.out.println("*".repeat(depth*2-1));

        // 하단
        for (int i = 1; i <= depth - 1; i++) {
            System.out.print(" ".repeat(i));
            System.out.print("*".repeat((depth - i)*2 -1));
            System.out.println();
        }

    }
}
