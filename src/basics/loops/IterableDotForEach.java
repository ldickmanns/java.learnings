package basics.loops;

import java.util.Arrays;
import java.util.List;

/********************
 * Java Learnings  	*
 * @java.learnings	*
 ********************/

public class IterableDotForEach {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		// Normal for each loop
		for (Integer i : list) {
			System.out.print(i);
		}
		
		System.out.println();
		
		// forEach method + lambda expression
		list.forEach(i -> System.out.print(i));
		
		System.out.println();
		
		// forEach method + static method reference
		list.forEach(System.out::print);
	}
}

/************
 * Output:	*
 * 12345	*
 * 12345	*
 * 12345	*
 ************/
