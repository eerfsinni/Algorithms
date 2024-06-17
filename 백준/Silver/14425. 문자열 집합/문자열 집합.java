import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int answer = 0;

        Map<String, Integer> words = new HashMap<>();
        for (int i=0; i<n; i++) {
            words.put(br.readLine(), 1);
        }

        for (int i=0; i<m; i++) {
            if (words.containsKey(br.readLine())) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}