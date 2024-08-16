import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int i=0; i<n; i++) {
            int command = Integer.parseInt(br.readLine());
            if (command == 0) {
                Integer poll = priorityQueue.poll();
                if (poll == null) {
                    bw.write(0 + "\n");
                } else {
                    bw.write(poll + "\n");
                }
            } else {
                priorityQueue.add(command);
            }
        }

        bw.flush();
        bw.close();
    }
}

