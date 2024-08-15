import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        Stack<Tower> stack = new Stack<>();
        int t = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<t; i++) {
            int target = Integer.parseInt(st.nextToken());
            if (stack.isEmpty()) {
                bw.write(0 + " ");
                stack.push(new Tower(i+1, target));
            } else {
                while(true) {
                    if (stack.isEmpty()) {
                        bw.write(0 + " ");
                        stack.push(new Tower(i+1, target));
                        break;
                    }

                    Tower peekTower = stack.peek();
                    if (target < peekTower.height) {
                        bw.write(peekTower.order + " ");
                        stack.push(new Tower(i+1, target));
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
        }

        bw.flush();
        bw.close();
    }
}

class Tower {
    int order;
    int height;
    Tower(int order, int height) {
        this.order = order;
        this.height = height;
    }
}