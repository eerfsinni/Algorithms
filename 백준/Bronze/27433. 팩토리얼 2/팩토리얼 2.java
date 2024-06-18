import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int target = Integer.parseInt(br.readLine());
        factorial(target, 1);
    }

    static void factorial(int number, long result) {
        if (number == 0) {
            System.out.println(result);
            return;
        }
        result *= number;
        factorial(number-1, result);
    }
}
