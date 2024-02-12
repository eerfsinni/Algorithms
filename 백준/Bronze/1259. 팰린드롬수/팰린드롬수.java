import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean isReversed = true;

        while (true) {
            String line = br.readLine();
            if (line.equals("0")) {
                break;
            }

            isReversed = true;
            for (int i = 0; i < line.length() / 2; i++) {
                if (line.charAt(i) != line.charAt(line.length()-1-i)) {
                    isReversed = false;
                    break;
                }
            }

            if (isReversed) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
