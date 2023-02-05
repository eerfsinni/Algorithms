import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sugar = sc.nextInt();
		
			boolean isSugar = true;
			int a = sugar/5; // 5kg 봉지의 수
			int b = sugar%5; // 3kg 봉지가 필요한가지 판단
			
			while (b%3 != 0) { // 5kg 봉지를 하나씩 빼면서, 3으로 나누어떨어질 때까지 반복
				a--;
				b = (sugar-(5*a))%3;
				
				if (a < 0) {	// 5kg 봉지 다 뺐는데도 안되면 불가능한 것
					isSugar = false;
					break;
				}
			}
			
			if (isSugar == false) {
				System.out.println(-1);
			}
			else {
				System.out.println(a + (sugar-(5*a))/3);
			}
			
		
	} // main
} // class