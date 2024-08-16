import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, R, C, answer = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        findZ(0, 0, (int) Math.pow(2, N));
    }

    static void findZ(int r, int c, int size) {

        // 최대로 분할했을 때 정답
        if (size == 1) {
            System.out.println(answer);
            return;
        }

        // 하나씩 분할
        int currentSize = size/2;

        // 좌상단에 위치했는가?
        if (R < r + currentSize && C < c + currentSize) {
            findZ(r, c, currentSize);
        }

        // 우상단에 위치했는가?
        if (R < r + currentSize && C >= c + currentSize) {
            answer += (size * size) / 4;
            findZ(r, c + currentSize, currentSize);
        }

        // 좌하단에 위치했는가?
        if (R >= r + currentSize && C < c + currentSize) {
            answer += (size * size) / 4 * 2;
            findZ(r + currentSize, c, currentSize);
        }

        // 우하단에 위치했는가?
        if (R >= r + currentSize && C >= c + currentSize) {
            answer += (size * size) / 4 * 3;
            findZ(r + currentSize, c + currentSize, currentSize);
        }
    }
}
