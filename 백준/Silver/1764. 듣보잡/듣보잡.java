import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int answer = 0;
        Map<String, Integer> people = new HashMap<>();
        for (int i=0; i<n; i++) {
            people.put(br.readLine(), 1);
        }

        List<String> list = new ArrayList<>();
        for (int i=0; i<m; i++) {
            String candidate = br.readLine();
            if (people.containsKey(candidate)) {
                answer++;
                list.add(candidate);
            }
        }

        Collections.sort(list);
        System.out.println(answer);
        for (String name : list) {
            System.out.println(name);
        }
    }
}