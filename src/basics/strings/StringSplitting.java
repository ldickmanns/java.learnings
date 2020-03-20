package basics.strings;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

import java.util.Scanner;

public class StringSplitting {

	public static void main(String[] args) {
		
		// Using the split method
		String helloWorld = "Hello World!";
		String[] split = helloWorld.split(" ");
		for (String string : split) {
			System.out.println(string);
		}
		
		// Using the Scanner Class
		String javaLearnings = "java.learnings";
		Scanner scanner = new Scanner(javaLearnings);
		scanner.useDelimiter("\\.");
		while (scanner.hasNext()) {
			System.out.println(scanner.next());
		}
		scanner.close();
	}
}

/****************
 * Output:		*
 * Hello		*
 * World!		*
 * java			*
 * learnings	*
 ****************/
