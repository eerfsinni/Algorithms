import java.util.*;
import java.io.*;

public class Main {

	static int paper[][];
	static int white;
	static int blue;
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		paper = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				paper[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		divAndCon(0, 0, n);
		bw.write(String.valueOf(white) + '\n');
		bw.write(String.valueOf(blue));
		
		bw.flush();
		bw.close();
	}
	
	static void divAndCon(int x, int y, int sq) {
		
		// 탈출 케이스
		if(isSameSq(x, y, sq)) {
			return;
		}
		
		// 아니라면 사이즈를 줄여서 반복
		int newSq = sq/2;
		
		divAndCon(x, y, newSq);
		divAndCon(x, y+newSq, newSq);
		divAndCon(x+newSq, y, newSq);
		divAndCon(x+newSq, y+newSq, newSq);
		
	}
	
	static boolean isSameSq(int x, int y, int sq) {
		
		int same = paper[x][y];
		for (int i = x; i < x+sq; i++) {
			for (int j = y; j < y+sq; j++) {
				if(paper[i][j] != same) {
					return false;
				}
			}
		}
		
		if(same == 0) {
			white++;
		} else {
			blue++;
		}
		
		return true;
	}
}