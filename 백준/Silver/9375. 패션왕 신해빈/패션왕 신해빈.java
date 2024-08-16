import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i=0; i<t; i++) {
            Map<String, Integer> clothes = new HashMap<>();
            int n = Integer.parseInt(br.readLine());
            for (int j=0; j<n; j++) {
                String cloth = br.readLine().split(" ")[1];
                clothes.put(cloth, clothes.getOrDefault(cloth, 0) + 1);
            }

            int answer = 1;
            for (int value : clothes.values()) {
                answer *= (value + 1);
            }
            System.out.println(--answer);
        }

    }
}

