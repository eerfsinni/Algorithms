import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String[] examples = new String[t];

        for (int i = 0; i < t; i++) {
            examples[i] = br.readLine();
        }

        for (int i = 0; i < examples.length; i++) {
            for (int j = 0; j < examples[i].length(); j++) {
                if (examples[0].charAt(j) != examples[i].charAt(j)) {
                    examples[0] = examples[0].substring(0, j) + '?' + examples[0].substring(j + 1);
                }
            }
        }

        System.out.println(examples[0]);

    }
}
