import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Map<String, Integer> workers = new HashMap<>();
        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String worker = st.nextToken();
            String status = st.nextToken();
            if (status.equals("enter")) {
                workers.put(worker, 1);
            } else {
                workers.remove(worker);
            }
        }

        List<String> result = new ArrayList<>(workers.keySet());
        result.sort(Comparator.reverseOrder());
        for (String worker : result) {
            System.out.println(worker);
        }
    }
}