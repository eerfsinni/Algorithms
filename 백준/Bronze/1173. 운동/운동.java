import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int goal = Integer.parseInt(st.nextToken()); // 목표 운동 시간
        int min = Integer.parseInt(st.nextToken()); // 초기 맥박, 최소 맥박
        int max = Integer.parseInt(st.nextToken()); // 최대 맥박
        int heartPlus = Integer.parseInt(st.nextToken()); // 분당 증가 심박 수
        int heartMinus = Integer.parseInt(st.nextToken()); // 분당 감소 심박 수

        int heartNow = min;
        int workout = 0;
        int rest = 0;

        while (true) {
            if (max - min < heartPlus) {
                System.out.println(-1);
                break;
            }

            if (workout == goal) {
                System.out.println(workout + rest);
                break;
            }

            if (heartNow + heartPlus <= max) {
                heartNow += heartPlus;
                workout++;
            } else {
                heartNow -= heartMinus;
                if (heartNow < min) {
                    heartNow = min;
                }
                rest++;
            }
        }

    }
}
