import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean isReveresed = true;

        String word = br.readLine();

        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length()-1-i)) {
                isReveresed = false;
                break;
            }
        }

        if (isReveresed) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
