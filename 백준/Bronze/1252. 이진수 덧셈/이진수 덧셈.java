import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken();
        String b = st.nextToken();
        
        BigInteger aChange = new BigInteger(a, 2);
        BigInteger bChange = new BigInteger(b, 2);

        BigInteger sum = aChange.add(bChange);
        System.out.println(sum.toString(2));

    }
}
