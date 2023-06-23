import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		int cy = 100;
		int sd = 100;
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int cyDice = Integer.parseInt(st.nextToken());
			int sdDice = Integer.parseInt(st.nextToken());
			
			if(cyDice<sdDice) cy -= sdDice;
			else if(cyDice>sdDice) sd -= cyDice;
			else;
		}
		
		bw.write(String.valueOf(cy) + "\n" + String.valueOf(sd));
		
		bw.flush();
		bw.close();
	}
}
