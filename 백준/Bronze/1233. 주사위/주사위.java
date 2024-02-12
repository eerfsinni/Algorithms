import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[] sum = new int[a+b+c+1];

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                for (int k = 1; k <= c; k++) {
                    sum[i+j+k]++;
                }
            }
        }

        int max = sum[3];
        int answer = 3;
        for (int i = 3; i < sum.length; i++) {
            if (max < sum[i]) {
                max = sum[i];
                answer = i;
            }
        }

        System.out.println(answer);
    }
}
