import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] calls = new int[n];
        int young = 0;
        int min = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < calls.length; i++) {
            calls[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < calls.length; i++) {
            int youngQuote = calls[i] / 30;
            young += 10 * youngQuote + 10;

            int minQuote = calls[i] / 60;
            min += 15 * minQuote + 15;
        }

        if (young > min) {
            System.out.printf("%s %d", "M", min);
        } else if (young < min) {
            System.out.printf("%s %d", "Y", young);
        } else {
            System.out.printf("%s %s %d", "Y", "M", young);
        }

    }
}
