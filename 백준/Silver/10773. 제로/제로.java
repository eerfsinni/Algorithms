import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for (int i=0; i<n; i++) {
            int target = Integer.parseInt(br.readLine());
            if (target != 0) {
                stack.push(target);
            } else {
                stack.pop();
            }
        }

        int answer = 0;
        for (int number : stack) {
            answer += number;
        }

        System.out.println(answer);
    }
}
