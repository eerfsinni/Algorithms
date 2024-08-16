import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int m;
    static int n;
    static int k;
    static int[][] cabbage;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // Test Case
        int t = Integer.parseInt(br.readLine());
        for (int a = 0; a < t; a++) {
            // 변수 선언
            st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            // 배추밭
            cabbage = new int[m][n];
            visited = new boolean[m][n];

            for (int i = 0; i < k; i++) {
                st = new StringTokenizer(br.readLine());
                cabbage[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
            }

            // 탐색
            Queue<Node> queue = new LinkedList<>();
            int[] dx = {0, 0, -1, 1};
            int[] dy = {-1, 1, 0, 0};

            int answer = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {

                    if (cabbage[i][j] == 1 && !visited[i][j]) {
                        queue.add(new Node(i, j));
                        visited[i][j] = true;
                        answer++;
                    }

                    while (!queue.isEmpty()) {
                        Node node = queue.remove();

                        for (int d = 0; d < 4; d++) {
                            int tempX = node.x + dx[d];
                            int tempY = node.y + dy[d];

                            if (tempX < 0 || tempY < 0 || tempX >= m || tempY >= n) {
                                continue;
                            }

                            if (cabbage[tempX][tempY] == 1 && !visited[tempX][tempY]) {
                                queue.add(new Node(tempX, tempY));
                                visited[tempX][tempY] = true;
                            }
                        }
                    }
                }
            }
            System.out.println(answer);
        }
    }
}

class Node {
    int x;
    int y;

    Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

