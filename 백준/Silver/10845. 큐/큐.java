import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	
	static int[] queue = new int[10001];
	
	static int front = 0;
	static int back = 0;

	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String a = st.nextToken();
			
			switch(a) {
			case "push" :
				push(Integer.parseInt(st.nextToken()));
				break;
				
			case "pop" :
				System.out.println(pop());
				break;
				
			case "size" :
				System.out.println(size());
				break;
				
			case "empty" :
				System.out.println(empty());
				break;
				
			case "front" :
				System.out.println(front());
				break;
				
			case "back" :
				System.out.println(back());
				break;
			}
		}

		
	} // main
	
	// size
	public static int size() {
		return back - front;
	}
	
	// front
	public static int front() {
		if (empty() == 1) {
			return -1;
		}
		else {
			return queue[front];
		}

	}
	
	// back
	public static int back() {
		if (empty() == 1) {
			return -1;
		}
		else {
			return queue[back-1];
		}

	}
	
	// empty
	public static int empty() {
		if(back == front) {
			return 1;
		}
		else {
		return 0;
		}
	}
	
	// push
	public static void push(int x) {
		queue[back] = x;
		back++;
	}
	
	// pop
	public static int pop() {
		if (empty() == 1) {
			return -1;
		}
		else {
			int popped = queue[front];
			front ++;
			return popped;

		}

	}
	
	
	
} // class