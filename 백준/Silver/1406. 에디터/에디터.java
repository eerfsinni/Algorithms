import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 편집기 MAX : 600,000
        // L : 왼쪽 한칸(맨 앞이면 무시)
        // D : 오른쪽 한칸(맨 뒤면 무시)
        // B : 왼쪽 문자 삭제(맨 앞이면 무시)
        // P ? : ? 문자 왼쪽 추가

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        int t = Integer.parseInt(br.readLine());

        List<String> letters = new LinkedList<>(Arrays.asList(word.split("")));
        ListIterator<String> iterator = letters.listIterator();

        while (iterator.hasNext()) {
            iterator.next();
        }

        for (int i=0; i<t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            switch (command) {
                case "L":
                    if (iterator.hasPrevious()) {
                        iterator.previous();
                    }
                    break;
                case "D":
                    if (iterator.hasNext()) {
                        iterator.next();
                    }
                    break;
                case "B":
                    if (iterator.hasPrevious()) {
                        iterator.previous();
                        iterator.remove();
                    }
                    break;
                case "P":
                    iterator.add(st.nextToken());
                    break;
                default:
                    break;
            }
        }

        for (String s : letters) {
            bw.write(s);
        }

        bw.flush();
        bw.close();
    }
}
