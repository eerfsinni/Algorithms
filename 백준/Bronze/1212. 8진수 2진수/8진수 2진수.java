import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] change = {"000", "001", "010", "011", "100", "101", "110", "111"};

        StringBuilder sb = new StringBuilder();
        String line = br.readLine();
        for (int i = 0; i < line.length(); i++) {
            for (int j = 0; j < change.length; j++) {
                if (line.charAt(i) == j + '0') {
                    sb.append(change[j]);
                }
            }
        }

        if (line.equals("0")) {
            System.out.println(0);
        } else {
            while (sb.charAt(0) == '0') {
                sb = new StringBuilder(sb.substring(1));
            }
            System.out.println(sb);
        }

    }
}
