import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long[] file = new long[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < file.length; i++) {
            file[i] = Integer.parseInt(st.nextToken());
        }

        long cluster = Long.parseLong(br.readLine());
        long count = 0;

        for (int i = 0; i < n; i++) {
            if (file[i] > 0) {
                count += file[i] / cluster;
                if (file[i] % cluster > 0) {
                    count++;
                }
            }
        }

        System.out.println(count * cluster);
    }
}
