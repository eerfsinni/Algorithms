import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        n = n - n % 100;

        int f = Integer.parseInt(br.readLine());

        while (true) {
            if(n % f == 0) {
                break;
            }
            n++;
        }

        System.out.printf("%02d", n % 100);
    }
}
