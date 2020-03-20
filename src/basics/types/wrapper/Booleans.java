package basics.types.wrapper;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

public class Booleans {

	public static void main(String[] args) {
		// Primitive boolean:
		boolean bool = true;
		// Wrapper class:
		Boolean wrapper = new Boolean(true);
		// Autoboxing:
		Boolean autoboxed = false;
		// Unboxing:
		boolean unboxed = wrapper;
		// Functionalities of the Wrapper:
		String s = wrapper.toString();
		boolean fromString = Boolean.parseBoolean(s);
		Boolean and = Boolean.logicalAnd(bool, autoboxed);
		
		System.out.println(and);
		System.out.println(wrapper);
		System.out.println(unboxed);
		System.out.println(fromString);
	}
}

/************
 * Output:	*
 * false	*
 * true		*
 * true		*
 * true		*
 ************/
