package java8.lambdas.functionalInterfaces;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

import java.util.function.Predicate;

public class Predicates {

	public static void main(String[] args) {
		// Tests if a String can be parsed to Integer
		Predicate<String> intTest = s -> {
			try {
				Integer.parseInt(s);
				return true;
			} catch (NumberFormatException nfe) {
				return false;
			}
		};
		
		// Usage
		System.out.println(intTest.test("123"));
		System.out.println(intTest.test("Hello!"));
	}
}

/************
 * Output:	*
 * true		*
 * false	*
 ************/
