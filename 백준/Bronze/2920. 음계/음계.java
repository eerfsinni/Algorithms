import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] doremi = br.readLine().split(" ");

        boolean isAscending = Integer.parseInt(doremi[0]) < Integer.parseInt(doremi[1]);
        String answer = null;
        for (int i=1; i<doremi.length-1; i++) {
            int now = Integer.parseInt(doremi[i]);
            int next = Integer.parseInt(doremi[i+1]);
            if (now < next) {
                if (!isAscending) {
                    answer = "mixed";
                    break;
                }
            } else {
                if (isAscending) {
                    answer = "mixed";
                    break;
                }
            }
        }

        if (answer == null) {
            answer = isAscending ? "ascending" : "descending";
        }
        System.out.println(answer);
    }
}
