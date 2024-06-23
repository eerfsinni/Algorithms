import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] letters = new String[15][5];

        for (int i=0; i<5; i++) {
            String[] line = br.readLine().split("");
            for (int j=0; j<line.length; j++) {
                letters[j][i] = line[j];
            }
        }

        for (int i=0; i<15; i++) {
            for (int j=0; j<5; j++) {
                if (letters[i][j] != null) {
                    System.out.print(letters[i][j]);
                }
            }
         }

    }
}
