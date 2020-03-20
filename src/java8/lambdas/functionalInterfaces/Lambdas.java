package java8.lambdas.functionalInterfaces;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

public class Lambdas {

	public static void main(String[] args) {
		Calculation add = new Calculation() {
			@Override
			public int calculate(int a, int b) {
				return a + b;
			}
		};
		
		Calculation sub = (a, b) -> a - b;
		
		Calculation mod = (x, y) -> {
			while (y < x) {
				x = x - y;
			}
			return x;
		};
		
		// Usage
		System.out.println(add.calculate(11, 5));
		System.out.println(sub.calculate(11, 5));
		System.out.println(mod.calculate(11, 5));
	}
}

/** Interface with just one method. */
interface Calculation {
	int calculate(int a, int b);
}

/************
 * Output:	*
 * 16		*
 *  6		*
 *  1		*
 ************/
