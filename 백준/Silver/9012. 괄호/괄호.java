import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        Stack<String> stack = new Stack<>();

        for (int i=0; i<t; i++) {
            String[] split = br.readLine().split("");
            boolean isVPS = true;
            for (String element : split) {
                if (element.equals("(")) {
                    stack.add(element);
               } else {
                    if (stack.isEmpty()) {
                        isVPS = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }

            if (!isVPS || !stack.isEmpty()) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
            stack.clear();
        }

    }
}
