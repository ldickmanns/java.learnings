package java8.lambdas.functionalInterfaces;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

public class FunctionalIterfaces {

	public static void main(String[] args) {
		Greeting greeting = (name) -> {
			System.out.println("Hello " + name);
		};
		greeting.greet("fellow Devs!");
	}
}

@FunctionalInterface
interface Greeting {
	void greet(String name);
}

/************************
 * Output:				*
 * Hello fellow Devs!	*
 ************************/
