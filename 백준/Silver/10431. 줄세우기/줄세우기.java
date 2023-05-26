import java.util.*;
import java.io.*;

public class Main {

	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// tc 수
		int p = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <=p; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			ArrayList<Integer> students = new ArrayList<>();
			
			// tc 번호
			students.add(Integer.parseInt(st.nextToken()));
			
			// 학생 키
			for (int j = 0; j < 20; j++) {
				students.add(Integer.parseInt(st.nextToken()));
			}
			
			// 총 이동 수
			int count = 0;
			
			// 1번 학생부터 20번 학생까지 순회
			for (int j = 1; j <=20 ; j++) {
				
				int big = 0; // 비교 학생보다 큰 키(초기화)
				int maxIdx = 0; // 비교 학생보다 큰 키의 index(초기화)
				int currentStu = students.get(j); // 비교 학생
				
				// 비교 학생은, 나의 앞 순번 학생들이랑만 비교하면 됨
				for (int k = 1; k < j; k++) {
					// 비교 학생보다 큰 학생이 있으면
					if(currentStu < students.get(k)) {
						count++;
					}
					
				}
				
			}
			
			System.out.println(students.get(0) + " " + count);
		}
		
	}
}