import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num = br.readLine();
		
		// 기본 Array (basicArr)
		String split[] = num.split("");
		int maxNum = 0;
		int basicArr[] = new int[split.length];
		for (int i = 0; i < basicArr.length; i++) {
			basicArr[i] = Integer.parseInt(split[i]);
			
			if (maxNum < basicArr[i]) {
				maxNum = basicArr[i];
			}
		}
		
		// Counting Array (countingArr)
		int countingArr[] = new int[maxNum+1];
		for (int i = 0; i < basicArr.length; i++) {
			countingArr[basicArr[i]]++;
		}
		
		// 누적합으로 변경
		for (int i = 1; i < countingArr.length; i++) {
			countingArr[i] = countingArr[i] + countingArr[i-1];
		}
		
		// 결과값 Array (resultArr)
		int resultArr[] = new int[basicArr.length];
		
		for (int i = basicArr.length-1; i >=0; i--) {
			int value = basicArr[i];
			countingArr[value]--;
			resultArr[countingArr[value]] = value;
		}
		
		for (int i = resultArr.length-1; i >=0; i--) {
			System.out.print(resultArr[i]);
		}
	}
}
