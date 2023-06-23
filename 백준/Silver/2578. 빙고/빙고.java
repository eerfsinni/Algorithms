import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int[][] bingo = new int[5][5];
		int call[] = new int[25];
		int answer = 1;

		// 빙고판
		for (int i = 0; i < 5; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 5; j++) {
				bingo[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		// 번호 호출
		int callCount = 0;
		for (int i = 0; i < 5; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 5; j++) {
				call[callCount] = Integer.parseInt(st.nextToken());;
				callCount++;
			}
		}

		// 번호 하나씩 호출하면서 가로, 세로, 대각선 판단
		for (int i = 0; i < 25; i++) {

			for (int j = 0; j < 5; j++) {
				for (int k = 0; k < 5; k++) {
					if(bingo[j][k]==call[i]) {
						bingo[j][k]=0;
					}
				}
			}

			int bingoCount = 0;

			// 가로 빙고 수
			for (int j = 0; j < 5; j++) {
				int sumGaro = 0;
				for (int k = 0; k < 5; k++) {
					sumGaro += bingo[j][k];
				}

				if(sumGaro==0) bingoCount++;

				sumGaro = 0;
			}

			// 세로 빙고 수
			for (int j = 0; j < 5; j++) {
				int sumSero = 0;
				for (int k = 0; k < 5; k++) {
					sumSero += bingo[k][j];
				}

				if(sumSero==0) bingoCount++;

				sumSero = 0;
			}

			// 대각선(우하향) 빙고 여부
			int sumDaeRD = 0;
			for (int j = 0; j < 5; j++) {
				sumDaeRD += bingo[j][j];
			}
			if(sumDaeRD==0) bingoCount++;
			
			// 대각선(좌하향) 빙고 여부
			int sumDaeLD = 0;
			for (int j = 0; j < 5; j++) {
				sumDaeLD += bingo[j][4-j];
			}
			if(sumDaeLD==0) bingoCount++;
			
			if (bingoCount>=3) break;
			answer++;
		}

		System.out.println(answer);
	}
}
