import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // Board 및 방문 여부 선언
        int[][] board = new int[n][m];
        boolean[][] isVisited = new boolean[n][m];

        // 방향 탐색
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};

        // Board 만들기
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<m; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 정답 변수 선언
        int answer = 0;
        int maxSize = 0;

        Queue<Node> queue = new LinkedList<>();
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {

                if (board[i][j] == 1 && !isVisited[i][j]) {
                    int currentSize = 0;
                    queue.add(new Node(i, j));
                    isVisited[i][j] = true;

                    while (!queue.isEmpty()) {
                        Node node = queue.remove();
                        currentSize++;

                        for (int d=0; d<4; d++) {
                            int tempX = node.x + dx[d];
                            int tempY = node.y + dy[d];

                            if (tempX < 0 || tempX >= n || tempY < 0 || tempY >= m) {
                                continue;
                            }

                            if (board[tempX][tempY] == 1 && !isVisited[tempX][tempY]) {
                                queue.add(new Node(tempX, tempY));
                                isVisited[tempX][tempY] = true;
                            }

                        }
                    }
                    answer++;
                    if (currentSize > maxSize) {
                        maxSize = currentSize;
                    }
                }
            }
        }
        System.out.println(answer);
        System.out.println(maxSize);
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

