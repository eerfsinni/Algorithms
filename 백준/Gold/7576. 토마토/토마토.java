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

        int[][] tomatoBox = new int[m][n];

        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};

        Queue<Node> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                tomatoBox[i][j] = Integer.parseInt(st.nextToken());
                if (tomatoBox[i][j] == 1) {
                    queue.add(new Node(i, j, 0));
                }
            }
        }

        // 이미 채워지면 0
        if (isCompleted(tomatoBox)) {
            System.out.println(0);
            return;
        }

        int day = 0;
        while (!queue.isEmpty()) {
            Node tempNode = queue.remove();
            day = tempNode.day;

            for (int d = 0; d < 4; d++) {
                int tempX = tempNode.x + dx[d];
                int tempY = tempNode.y + dy[d];

                if (tempX < 0 || tempY < 0 || tempX >= m || tempY >= n) {
                    continue;
                }

                if (tomatoBox[tempX][tempY] == 0) {
                    tomatoBox[tempX][tempY] = 1;
                    queue.add(new Node(tempX, tempY, day+1));
                }
            }
        }

        if (isCompleted(tomatoBox)) {
            System.out.println(day);
        } else {
            System.out.println(-1);
        }
    }

    static boolean isCompleted(int[][] tomatoBox) {
        for (int i = 0; i < tomatoBox.length; i++) {
            for (int j = 0; j < tomatoBox[i].length; j++) {
                if (tomatoBox[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}


class Node {
    int x;
    int y;
    int day;

    Node(int x, int y, int day) {
        this.x = x;
        this.y = y;
        this.day = day;
    }
}

