import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[][] board = new int[m][n];
        int[][] result = new int[m][n];
        boolean[][] visited = new boolean[m][n];
        int[] startIdx = new int[2];

        for (int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<n; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
                if (board[i][j] == 2) {
                    startIdx[0] = i;
                    startIdx[1] = j;
                    visited[i][j] = true;
                    result[i][j] = 0;
                } else if (board[i][j] == 0) {
                    visited[i][j] = true;
                    result[i][j] = 0;
                }
            }
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(startIdx[0], startIdx[1], 0));
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};

        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                while (!queue.isEmpty()) {
                    Node node = queue.remove();

                    for (int d=0; d<4; d++) {
                        int tempX = node.x + dx[d];
                        int tempY = node.y + dy[d];

                        if (tempX<0 || tempY<0 || tempX>=m || tempY>=n) {
                            continue;
                        }

                        if (board[tempX][tempY] == 1 && !visited[tempX][tempY]) {
                            int increaseCount = node.count+1;
                            queue.add(new Node(tempX, tempY, increaseCount));
                            result[tempX][tempY] = increaseCount;
                            visited[tempX][tempY] = true;
                        }
                    }

                }
            }
        }

        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if (result[i][j] == 0 && !visited[i][j]) {
                    bw.write(-1 + " ");
                } else {
                    bw.write(result[i][j] + " ");
                }
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }
}

class Node{
    int x;
    int y;
    int count;

    Node(int x, int y, int count) {
        this.x = x;
        this.y = y;
        this.count = count;
    }
}