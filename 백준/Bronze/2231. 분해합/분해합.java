import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = 1;
        while (true) {
            String candidate = String.valueOf(answer);
            int sum = answer;
            for (int i=0; i<candidate.length(); i++) {
                sum += candidate.charAt(i) - '0';
            }
            if (sum == n) {
                System.out.println(answer);
                break;
            }
            if (answer == n) {
                System.out.println(0);
                break;
            }
            answer++;
        }
    }
}