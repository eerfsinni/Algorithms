import java.util.*;
import java.io.*;

public class Main {

	static int paper[][];	// 색종이
	static int pMinus;		// -1
	static int pZero;		// 0
	static int pPlus;		// 1
	
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
		bw.write(String.valueOf(pMinus) + '\n');
		bw.write(String.valueOf(pZero) + '\n');
		bw.write(String.valueOf(pPlus));
		
		bw.flush();
		bw.close();
		
	}
	
	static void divAndCon(int x, int y, int sq) {
		
		// 탈출 Case
		if(isSameSq(x, y, sq)) {
			return;
		}
		
		
		// 아니라면
		int newSq = sq/3;
		
		// 3배수이므로 9방향
		/*
		   1  2  3
		   4  5  6
		   7  8  9
		 */
		
		divAndCon(x, y, newSq); // 1
		divAndCon(x, y+newSq, newSq); // 2
		divAndCon(x, y+newSq*2, newSq); // 3
		
		divAndCon(x+newSq, y, newSq); // 4
		divAndCon(x+newSq, y+newSq, newSq); // 5
		divAndCon(x+newSq, y+newSq*2, newSq); // 6
		
		divAndCon(x+newSq*2, y, newSq); // 7
		divAndCon(x+newSq*2, y+newSq, newSq); // 8
		divAndCon(x+newSq*2, y+newSq*2, newSq); // 9
		
	}
	
	static boolean isSameSq(int x, int y, int sq) {
		
		int same = paper[x][y];
		for (int i = x; i < x+sq; i++) {
			for (int j = y; j < y+sq; j++) {
				if(paper[i][j]!=same) {
					return false;
				}
			}
		}
		
		if(same==-1) {
			pMinus++;
		} else if(same==0) {
			pZero++;
		} else {
			pPlus++;
		}
		
		return true;
	}
	
}