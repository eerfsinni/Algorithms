import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        LinkedList<Integer> stack = new LinkedList<>();
        int t = Integer.parseInt(br.readLine());
        for (int i=0; i<t; i++) {
            st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push":
                    stack.add(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if (stack.isEmpty()) {
                        bw.write(-1+"\n");
                    } else {
                        int popNumber = stack.removeLast();
                        bw.write(popNumber+"\n");
                    }
                    break;
                case "size":
                    bw.write(stack.size()+"\n");
                    break;
                case "empty":
                    if (stack.isEmpty()) {
                        bw.write(1+"\n");
                    } else {
                        bw.write(0+"\n");
                    }
                    break;
                case "top":
                    if (stack.isEmpty()) {
                        bw.write(-1+"\n");
                    } else {
                        bw.write(stack.getLast()+"\n");
                    }
                    break;
                default:
                    break;
            }
        }

        bw.flush();
        bw.close();
    }
}
