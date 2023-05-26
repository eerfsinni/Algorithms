import java.util.*;
import java.io.*;

public class Main {

	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// n x n 정사각형 판 만들기(2차원 배열)
		int n = Integer.parseInt(br.readLine());
		char[][] cookie = new char[n+1][n+1];

		for (int i = 1; i <= n; i++) {
			String line = br.readLine();
			char elem[] = line.toCharArray();

			for (int j = 1; j <= n; j++) {
				cookie[i][j] = elem[j-1];
			}
		}

		// 심장 좌표 찾기
		int heartX = 0;
		int heartY = 0;
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {

				// 처음 등장하는 *를 찾으면(머리)
				if(cookie[i][j]=='*') {

					// 심장은 머리 바로 아래(y+1) 
					heartX = i+1;
					heartY = j;
					break;
				}
			}

			if(heartX != 0) break;
		}


		// 왼쪽 팔 길이 : 심장의 왼쪽부터 시작(heartX 고정, heartY가 1까지)
		int leftArm = 0;
		for (int i = heartY-1; i>=1; i--) {
			if(cookie[heartX][i] == '*') {
				leftArm++;
			} else break;
		}

		// 오른쪽 팔 길이 : 심장의 오른쪽부터 시작(heartX 고정, heartY가 n까지)
		int rightArm = 0;
		for (int i = heartY+1; i<=n; i++) {
			if(cookie[heartX][i] == '*') {
				rightArm++;
			} else break;
		}

		// 허리 길이 및 끝 좌표 : 심장의 아래부터 시작(heartX가 n까지, heartY 고정)
		int waist = 0;
		int waistEnd = 0;
		for (int i = heartX+1; i<=n; i++) {
			if(cookie[i][heartY] == '*') {
				waist++;
				waistEnd = i;
			} else break;
		}

		// 허리 끝 좌표 : cookie[waistEnd][heartY]

		// 왼쪽 다리 길이 : 허리의 왼쪽 아래부터 시작(waistEnd가 n까지, heartY-1 고정)
		int leftLeg = 0;
		for (int i = waistEnd+1; i <= n; i++) {
			if(cookie[i][heartY-1] == '*') {
				leftLeg++;
			} else break;
		}

		// 오른쪽 다리 길이 : 허리의 오른쪽 아래부터 시작(waistEnd가 n까지, heartY+1 고정)
		int rightLeg = 0;
		for (int i = waistEnd+1; i <= n; i++) {
			if(cookie[i][heartY+1] == '*') {
				rightLeg++;
			} else break;
		}

		// 심장 좌표 출력
		bw.write(heartX + " " + heartY + '\n');
		
		// 왼팔 오른팔 허리 왼다리 오른다리 출력
		bw.write(leftArm + " " + rightArm + " " + waist + " " + leftLeg + " " + rightLeg);
		
		bw.flush();
		bw.close();
	}
}