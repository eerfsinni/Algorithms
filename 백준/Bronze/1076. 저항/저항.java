import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        int[] value = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] multiple = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
        long answer = 0;

        String inputColor = br.readLine();
        String valueColor = br.readLine();
        String multipleColor = br.readLine();

        // color
        for (int i = 0; i < color.length; i++) {
            if (inputColor.equals(color[i])) {
                answer += value[i] * 10;
            }
        }

        // value
        for (int i = 0; i < color.length; i++) {
            if (valueColor.equals(color[i])) {
                answer += value[i];
            }
        }

        // multiple
        for (int i = 0; i < color.length; i++) {
            if (multipleColor.equals(color[i])) {
                answer *= multiple[i];
            }
        }
        
        System.out.println(answer);
    }
}
