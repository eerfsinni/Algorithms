import java.util.*;
import java.io.*;

public class Main {

	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int quadT[][];
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		quadT = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			String line = br.readLine();
			char toChar[] = line.toCharArray();
			
			for (int j = 0; j < n; j++) {
				quadT[i][j] = toChar[j]-'0';
			}
		}
		
		divAndCon(0, 0, n);
		bw.flush();
		bw.close();
		
	}

	static void divAndCon(int x, int y, int sq) throws IOException {
		
		// 탈출 Case : 같은 크기의 4개 구역이 모두 같은가?
		if(isSameSq(x, y, sq)) {
			bw.write(String.valueOf(quadT[x][y]));
			return;
		}
		
		// 아니라면 사이즈 절반씩 줄임
		int newSq = sq/2;
		
		bw.write('(');
		
		// 각 구역별로 분할정복
		divAndCon(x, y, newSq);			// 왼쪽 위
		divAndCon(x, y + newSq, newSq); // 오른쪽 위
		divAndCon(x + newSq, y, newSq); // 왼쪽 아래
		divAndCon(x + newSq, y + newSq, newSq); // 오른쪽 아래
		
		bw.write(')');
		
	}
	
	// 같은 구역 모두 같은지 확인해보기
	static boolean isSameSq(int x, int y, int sq) {
		
		// 0 or 1 값 저장
		int same = quadT[x][y];
		
		// 기준점부터 벙해진 범위까지 모두 같은 값인가?
		for (int i = x; i < x+sq; i++) {
			for (int j = y; j < y+sq; j++) {
				if(same != quadT[i][j]) {
					return false;
				}
			}
		}
		
		return true;
	}
	
}