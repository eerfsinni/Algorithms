import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        long answer = 0;
        for (int i=0; i<n; i++) {
            int target = Integer.parseInt(br.readLine());
            while(!stack.isEmpty()) {
                if (stack.peek() <= target) {
                    stack.pop();
                } else {
                    break;
                }
            }
            answer += stack.size();
            stack.push(target);
        }
        System.out.println(answer);
    }
}

