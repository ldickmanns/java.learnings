package basics.types.primitive;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

public class PrimitiveTypes {

	public static void main(String[] args) {
		boolean bool = true;
		byte b = -0x80;
		char c = '\u2227';
		short s = 32767;
		int i = 1;
		long l = 300l;
		float f = 123.4f;
		double d = 1.0;
			
		System.out.println("The primitive types:");
		System.out.println("bool: " + bool);
		System.out.println("byte: " + b);
		System.out.println("char: " + c);
		System.out.println("short: " + s);
		System.out.println("int: " + i);
		System.out.println("long: " + l);
		System.out.println("float: " + f);
		System.out.println("double: " + d);
	}
}

/************************
 * Output:				*
 * The primitive types:	*
 * bool: true			*
 * byte: -128			*
 * char: ∧				*
 * short: 32767			*
 * int: 1				*
 * long: 300			*
 * float: 123.4			*
 * double: 1.0			*
 ************************/
