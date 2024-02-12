import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] vowel = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        int count = 0;

        while (true) {
            String line = br.readLine();
            if (line.equals("#")) {
                break;
            }

            count = 0;
            for (int i = 0; i < line.length(); i++) {
                for (int j = 0; j < vowel.length; j++) {
                    if (line.charAt(i) == vowel[j]) {
                        count++;
                        break;
                    }
                }
            }

            System.out.println(count);
        }
    }
}
