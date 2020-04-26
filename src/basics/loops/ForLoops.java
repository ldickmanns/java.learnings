package basics.loops;

/********************
 * Java Learnings  	*
 * @java.learnings	*
 ********************/

import java.util.Arrays;
import java.util.List;

public class ForLoops {

	public static void main(String[] args) {
		String[] strings = {"Coding ", "is ", "awesome!"};

		// for loop:
		for (int i = 0; i < strings.length; i++) {
			System.out.print(strings[i]);
			strings[i] = strings[i].toUpperCase();
		}

		System.out.println();
		
		// foreach or enhanced for loop:
		List<String> list = Arrays.asList(strings);
		for (String string : list) {
			System.out.print(string);
		}
	}
}

/************************
 * Output:				*
 * Coding is awesome!	*
 * CODING IS AWESOME!	*
 ************************/
