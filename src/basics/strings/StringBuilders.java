package basics.strings;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

public class StringBuilders {
	
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("Hello");
		builder.append(' ');
		builder.append("fellowDevs!");
		int i = builder.indexOf("Devs");
		builder.insert(i, ' ');
		System.out.println(builder.toString());
		System.out.println(builder.length());
		System.out.println(builder.reverse());
	}
}

/************************
 * Output:				*
 * Hello fellow Devs!	*
 * 18					*
 * !sveD wollef olleH	*
 ************************/
