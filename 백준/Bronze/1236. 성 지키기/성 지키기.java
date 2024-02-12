import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        char[][] board = new char[n][m];
        boolean guard = false;
        int guardX = 0;
        int guardY = 0;

        for (int i = 0; i < n; i++) {
            char[] split = br.readLine().toCharArray();
            for (int j = 0; j < m; j++) {
                board[i][j] = split[j];
            }
        }

        for (int i = 0; i < n; i++) {
            guard = false;
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 'X') {
                    guard = true;
                    break;
                }
            }
            if (!guard) {
                guardX++;
            }
        }

        for (int i = 0; i < m; i++) {
            guard = false;
            for (int j = 0; j < n; j++) {
                if (board[j][i] == 'X') {
                    guard = true;
                    break;
                }
            }
            if (!guard) {
                guardY++;
            }
        }

        System.out.println(Math.max(guardX, guardY));
    }
}
