import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		Person[] members = new Person[n];

		for (int i = 0; i < members.length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			members[i] = new Person(Integer.parseInt(st.nextToken()), st.nextToken(), i);
		}

		Arrays.sort(members, new personCompare());
		
		for (int i = 0; i < members.length; i++) {
			System.out.println(members[i].age + " " + members[i].name);
		}

	}

}

class Person {
	
	int age;
	String name;
	int order;
	
	public Person(int age, String name, int order) {
		this.age = age;
		this.name = name;
		this.order = order;
	}
}

class personCompare implements Comparator<Person> {

	public int compare(Person p1, Person p2) {

		if (p1.age == p2.age) {
			return p1.order - p2.order;
		} else {
			return p1.age - p2.age;
		}
	}
}
