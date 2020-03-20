package basics.collections;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Collections {

	public static void main(String[] args) {
		Collection<Integer> c = new ArrayList<>();
		c.addAll(Arrays.asList(1, 2, 3));
		
		System.out.println(c.size());
		System.out.println(c.isEmpty());
		System.out.println(c.contains(2));
		for (Integer i : c) {
			System.out.println(i);
		}
	}
}

/************
 * Output:	*
 * 3		*
 * false	*
 * true		*
 * 1		*
 * 2		*
 * 3		*
 ************/
