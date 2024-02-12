import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        double d = Double.parseDouble(st.nextToken());
        double h = Double.parseDouble(st.nextToken());
        double w = Double.parseDouble(st.nextToken());

        double sum = Math.pow(d, 2) / (Math.pow(h, 2) + Math.pow(w, 2));
        double sqrt = Math.sqrt(sum);

        System.out.println((int) (sqrt * h) + " " + (int) (sqrt * w));
    }
}
