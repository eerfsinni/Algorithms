import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        // 크로아티아 알파벳들
        String[] croatian = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        // 크로아티아 알파벳을 대치하여 변경
        for (int i = 0; i < croatian.length; i++) {
            if (word.contains(croatian[i])) {
                word = word.replace(croatian[i], "!");
            }
        }

        // 대치된 단어의 길이 출력
        System.out.println(word.length());
    }
}
