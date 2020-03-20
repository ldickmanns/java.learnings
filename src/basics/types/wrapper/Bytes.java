package basics.types.wrapper;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

public class Bytes {

	public static void main(String[] args) {
		// Primitive byte:
		byte b = 0x7F;
		// Wrapper class:
		Byte wrapper = new Byte(b);
		// Autoboxing:
		Byte autoboxed = -128;
		// Unboxing:
		byte unboxed = autoboxed;
		// Functionalities of the Wrapper:
		String s = wrapper.toString();
		byte fromString = Byte.parseByte(s);
		
		System.out.println(unboxed);
		System.out.println(s);
		System.out.println(fromString);
	}
}

/************
 * Output:	*
 * -128		*
 *  127		*
 *  127		*
 ************/
