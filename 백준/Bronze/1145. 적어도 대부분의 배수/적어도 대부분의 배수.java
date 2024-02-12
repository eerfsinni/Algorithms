import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[5];
        int answer = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        while (true) {
            if (count >= 3) {
                break;
            } else {
                count = 0;
                answer++;
            }

            for (int i = 0; i < arr.length; i++) {
                if (answer % arr[i] == 0) {
                    count++;
                }
            }
        }

        System.out.println(answer);
    }
}
