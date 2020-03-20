package basics.types.wrapper;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

public class Longs {

	public static void main(String[] args) {
		// Primitive long:
		long l = 10;
		// Wrapper class:
		Long wrapper = new Long(-10);
		// Functionalities of the Wrapper:
		String s = wrapper.toString();
		long fromString = Long.parseLong(s);
		int comp = Long.compare(l, fromString);
		long minimum = Long.min(l, wrapper);
		
		System.out.println(comp);
		System.out.println(minimum);
	}
}

/************
 * Output:	*
 *   1		*
 * -10		*
 ************/
