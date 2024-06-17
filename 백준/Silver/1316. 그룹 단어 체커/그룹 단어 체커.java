import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int count = 0;
        boolean groupCheck;
        for (int i=0; i<t; i++) {
            int[] alphabet = new int[26];
            groupCheck = true;

            String word = br.readLine();
            for (int j=0; j<word.length(); j++) {
                int target = word.charAt(j) - 'a';
                if (alphabet[target] == 0) {
                    alphabet[target]++;
                } else {
                    if (word.charAt(j) != word.charAt(j-1)) {
                        groupCheck = false;
                        break;
                    }
                }
            }
            if (groupCheck) {
                count++;
            }
        }
        
        System.out.print(count);
    }
}