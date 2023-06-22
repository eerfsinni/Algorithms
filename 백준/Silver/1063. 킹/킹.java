import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		String king = st.nextToken();
		String dol = st.nextToken();
		int n = Integer.parseInt(st.nextToken());

		int[][] chess = new int[8][8];

		int kingX = 7-(king.charAt(1)-'1');
		int kingY = king.charAt(0)-'A';

		int dolX = 7-(dol.charAt(1)-'1');
		int dolY = dol.charAt(0)-'A';

		// king은 1, dol은 2
		chess[kingX][kingY] = 1;
		chess[dolX][dolY] = 2;

		for(int i=0; i<n; i++) {

			String move = br.readLine();

			switch (move) {
			case "R":	// 우

				// 킹이 움직인 곳이 돌의 위치와 같다면
				if(kingY+1 == dolY && kingX == dolX) {

					// 킹과 돌이 체스판에서 벗어나지 않는 경우에만
					if(dolY+1<=7) {
						chess[kingX][kingY] = 0;
						kingY++;
						chess[kingX][kingY] = 1;

						chess[dolX][dolY] = 0;
						dolY++;
						chess[dolX][dolY] = 2;
					}

					// 킹이 움직인 곳이 돌의 위치와 다르다면
				} else {

					// 킹이 체스판에서 벗어나지 않는 경우에만
					if(kingY+1<=7) {
						chess[kingX][kingY] = 0;
						kingY++;
						chess[kingX][kingY] = 1;
					}
				}
				break;

			case "L":	// 좌

				if(kingY-1 == dolY && kingX == dolX) {
					if(dolY-1>=0) {
						chess[kingX][kingY] = 0;
						kingY--;
						chess[kingX][kingY] = 1;

						chess[dolX][dolY] = 0;
						dolY--;
						chess[dolX][dolY] = 2;
					}
				} else {
					if(kingY-1>=0) {
						chess[kingX][kingY] = 0;
						kingY--;
						chess[kingX][kingY] = 1;
					}
				}
				break;

			case "B":	// 하

				if(kingY == dolY && kingX+1 == dolX) {
					if(dolX+1<=7) {
						chess[kingX][kingY] = 0;
						kingX++;
						chess[kingX][kingY] = 1;

						chess[dolX][dolY] = 0;
						dolX++;
						chess[dolX][dolY] = 2;
					}
				} else {
					if(kingX+1<=7) {
						chess[kingX][kingY] = 0;
						kingX++;
						chess[kingX][kingY] = 1;
					}
				}
				break;

			case "T":	// 상

				if(kingY == dolY && kingX-1 == dolX) {
					if(dolX-1>=0) {
						chess[kingX][kingY] = 0;
						kingX--;
						chess[kingX][kingY] = 1;

						chess[dolX][dolY] = 0;
						dolX--;
						chess[dolX][dolY] = 2;
					}
				} else {
					if(kingX-1>=0) {
						chess[kingX][kingY] = 0;
						kingX--;
						chess[kingX][kingY] = 1;
					}
				}
				break;

			case "RT":	// 우상

				if(kingY+1 == dolY && kingX-1 == dolX) {
					if(dolY+1<=7 && dolX-1>=0) {
						chess[kingX][kingY] = 0;
						kingX--; kingY++;
						chess[kingX][kingY] = 1;

						chess[dolX][dolY] = 0;
						dolX--; dolY++;
						chess[dolX][dolY] = 2;
					}
				} else {
					if(kingY+1<=7 && kingX-1>=0) {
						chess[kingX][kingY] = 0;
						kingX--; kingY++;
						chess[kingX][kingY] = 1;
					}
				}
				break;

			case "LT":	// 좌상

				if(kingY-1 == dolY && kingX-1 == dolX) {
					if(dolY-1>=0 && dolX-1>=0) {
						chess[kingX][kingY] = 0;
						kingX--; kingY--;
						chess[kingX][kingY] = 1;

						chess[dolX][dolY] = 0;
						dolX--; dolY--;
						chess[dolX][dolY] = 2;
					}
				} else {
					if(kingY-1>=0 && kingX-1>=0) {
						chess[kingX][kingY] = 0;
						kingX--; kingY--;
						chess[kingX][kingY] = 1;
					}
				}
				break;

			case "RB":	// 우하

				if(kingY+1 == dolY && kingX+1 == dolX) {
					if(dolY+1<=7 && dolX+1<=7) {
						chess[kingX][kingY] = 0;
						kingX++; kingY++;
						chess[kingX][kingY] = 1;

						chess[dolX][dolY] = 0;
						dolX++; dolY++;
						chess[dolX][dolY] = 2;
					}
				} else {
					if(kingY+1<=7 && kingX+1<=7) {
						chess[kingX][kingY] = 0;
						kingX++; kingY++;
						chess[kingX][kingY] = 1;
					}
				}
				break;

			case "LB":	// 좌하


				if(kingY-1 == dolY && kingX+1 == dolX) {
					if(dolY-1>=0 && dolX+1<=7) {
						chess[kingX][kingY] = 0;
						kingX++; kingY--;
						chess[kingX][kingY] = 1;

						chess[dolX][dolY] = 0;
						dolX++; dolY--;
						chess[dolX][dolY] = 2;
					}
				} else {
					if(kingY-1>=0 && kingX+1<=7) {
						chess[kingX][kingY] = 0;
						kingX++; kingY--;
						chess[kingX][kingY] = 1;
					}
				}
				break;

			default:
				break;
			}

		}

		char ansKingX = (char) (7 + '1' - kingX);
		char ansKingY = (char) (kingY + 'A');
		String ansKing = Character.toString(ansKingY).concat(Character.toString(ansKingX));

		char ansDolX = (char) (7 + '1' - dolX);
		char ansDolY = (char) (dolY + 'A');
		String ansDol = Character.toString(ansDolY).concat(Character.toString(ansDolX));

		System.out.println(ansKing);
		System.out.println(ansDol);


	}

}