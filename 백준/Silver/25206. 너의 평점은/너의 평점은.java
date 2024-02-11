import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Double> board = new HashMap<>();
        board.put("A+", 4.5);
        board.put("A0", 4.0);
        board.put("B+", 3.5);
        board.put("B0", 3.0);
        board.put("C+", 2.5);
        board.put("C0", 2.0);
        board.put("D+", 1.5);
        board.put("D0", 1.0);
        board.put("F", 0.0);

        double sumCredit = 0.0;
        double sumScore = 0.0;

        for (int i = 0; i < 20; i++) {
            String line = br.readLine();
            String[] info = line.split(" ");

            double credit = Double.parseDouble(info[1]);
            if (!info[2].equals("P")) {
                sumCredit += credit;
                sumScore += (credit * board.get(info[2]));
            }
        }

        System.out.printf("%6f", sumScore / sumCredit);
    }
}
