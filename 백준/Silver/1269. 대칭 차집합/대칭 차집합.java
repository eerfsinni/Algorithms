import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<Integer, Integer> numbers = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            numbers.put(Integer.parseInt(st.nextToken()), 1);
        }

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<m; i++) {
            int candidate = Integer.parseInt(st.nextToken());
            numbers.put(candidate, numbers.getOrDefault(candidate, 0) + 1);
        }

        int answer = 0;
        for (int number : numbers.keySet()) {
            if (numbers.get(number) == 1) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}