import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int target = Integer.parseInt(br.readLine());
        System.out.println(fibo(target));
    }

    static int fibo(int number) {
        if (number == 0) {
            return 0;
        }
        if (number <= 2) {
            return 1;
        }
        return fibo(number-2) + fibo(number-1);
    }
}
