import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int target = Integer.parseInt(br.readLine());

        int n = 0;
        int candidate = 1;
        String endingNumber = "666";
        while (true) {
            String value = String.valueOf(candidate);
            if (value.contains(endingNumber)) {
                n++;
            }
            if (n == target) {
                System.out.println(candidate);
                break;
            }
            candidate++;
        }

    }
}