import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;

        for (int i = 0; i < 8; i++) {
            String line = br.readLine();

            // 짝수 줄
            if (i % 2 == 0) {
                for (int j = 0; j < 8; j++) {
                    if (j % 2 == 0) {
                        if (line.charAt(j) == 'F') {
                            count++;
                        }
                    }
                }
            // 홀수 줄
            } else {
                for (int j = 0; j < 8; j++) {
                    if (j % 2 == 1) {
                        if (line.charAt(j) == 'F') {
                            count++;
                        }
                    }
                }
            }
        }

        System.out.println(count);
    }
}
