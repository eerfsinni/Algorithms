import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			
			int prison[] = new int[n+1];
			for (int j = 0; j <= n; j++) {
				prison[j] = 1;
			}
			
			for (int j = 1; j <= n; j++) {
				for (int k = 1; k <= n; k++) {
					
					if(k%j==0) {
						if(prison[k]==1) prison[k]=0;
						else prison[k]=1;
					}
				}
			}
			
			int count = 0;
			for (int j = 1; j <= n; j++) {
				if(prison[j]==0) count++;
			}
			
			bw.write(String.valueOf(count) + "\n");
		}
		
		bw.flush();
		bw.close();
	}
}
