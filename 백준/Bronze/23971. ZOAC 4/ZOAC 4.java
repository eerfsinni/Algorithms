import java.util.*;
import java.io.*;

public class Main {

	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int h = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int a = 0; // 가로 앉는 인원
		int b = 0; // 세로 앉는 인원
		
		// 나눴을 때 나머지가 0이면 몫으로 / 아니면 몫 + 1로
		if(h%(n+1)==0) {
			a = h/(n+1);
		} else {
			a = h/(n+1)+1;
		}
		
		if(w%(m+1)==0) {
			b = w/(m+1);
		} else {
			b = w/(m+1)+1;
		}
		
		System.out.println(a*b);
		
	}
}