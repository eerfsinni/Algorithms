import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static Integer[][] fiboCount = new Integer[41][2];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        fiboCount[0][0] = 1;
        fiboCount[0][1] = 0;
        fiboCount[1][0] = 0;
        fiboCount[1][1] = 1;

        int t = Integer.parseInt(br.readLine());
        for (int i=0; i<t; i++) {
            int fiboNum = Integer.parseInt(br.readLine());
            fibo(fiboNum);
            System.out.printf("%d %d\n", fiboCount[fiboNum][0], fiboCount[fiboNum][1]);
        }
    }

    static Integer[] fibo(int n) {
        if (fiboCount[n][0] == null || fiboCount[n][1] == null) {
            fiboCount[n][0] = fibo(n-1)[0] + fibo(n-2)[0];
            fiboCount[n][1] = fibo(n-1)[1] + fibo(n-2)[1];
        }
        return fiboCount[n];
    }
}


