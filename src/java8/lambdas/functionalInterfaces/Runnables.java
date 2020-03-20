package java8.lambdas.functionalInterfaces;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

public class Runnables {

	public static void main(String[] args) {
		// Anonymous Class implementing Runnable
		Runnable a = new Runnable() {
			@Override
			public void run() {
				System.out.println("Anonymous Class");
			}
		};
		
		// Lambda Function implementing Runnable
		Runnable b = () -> System.out.println("Lambda");
		
		a.run();
		b.run();
	}
}

/********************
 * Output:			*
 * Anonymous Class	*
 * Lambda			*
 ********************/
