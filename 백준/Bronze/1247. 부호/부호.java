import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {

            int n = Integer.parseInt(br.readLine());
            BigInteger sum = new BigInteger("0");

            for (int j = 0; j < n; j++) {
                BigInteger number = new BigInteger(br.readLine());
                sum = sum.add(number);
            }

            if (sum.compareTo(BigInteger.ZERO) == -1) {
                System.out.println('-');
            } else if (sum.compareTo(BigInteger.ZERO) == 1) {
                System.out.println('+');
            } else {
                System.out.println(0);
            }

        }

    }
}
