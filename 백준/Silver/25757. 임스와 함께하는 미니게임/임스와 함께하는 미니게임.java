import java.util.*;
import java.io.*;

public class Main {

	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 인원 수(n)와 게임의 종류(game)
		int n = Integer.parseInt(st.nextToken());
		String game = st.nextToken();
		
		// 게임 대기자 명단(members)
		Set<String> members = new HashSet<>();
		
		for (int i = 0; i < n; i++) {
			String player = br.readLine();
			members.add(player);
		}
		
		// 각 게임별 인원 수로 나눈 몫
		if(game.equals("Y")) {
			System.out.println(members.size());
		} else if(game.equals("F")) {
			System.out.println(members.size()/2);
		} else if(game.equals("O")){
			System.out.println(members.size()/3);
		}
	}
}