import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, String> siteInfo = new HashMap<>();
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            siteInfo.put(st.nextToken(), st.nextToken());
        }

        for (int i=0; i<m; i++) {
            bw.write(siteInfo.get(br.readLine())+"\n");
        }

        bw.flush();
        bw.close();
    }
}


