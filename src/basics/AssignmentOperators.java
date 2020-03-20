package basics;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

public class AssignmentOperators {

	public static void main(String[] args) {
		String helloWorld;
		// Using "=" and then "+"
		helloWorld = "Hello ";
		helloWorld = helloWorld + "World!";
		System.out.println(helloWorld);
		
		// Using "+="
		helloWorld = "Hello ";
		helloWorld += "World!";
		System.out.println(helloWorld);

		int i;
		// Using "=" and then "%"
		i = 5;
		i = i % 2;
		System.out.println(i);
		
		// Using "%="
		i = 5;
		i %= 2;
		System.out.println(i);
	}
}

/****************
 * Output:		*
 * Hello World!	*
 * Hello World!	*
 * 1			*
 * 1			*
 ****************/
