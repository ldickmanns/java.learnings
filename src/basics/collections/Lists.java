package basics.collections;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Lists {

	public static void main(String[] args) {
		// Creating a list and adding content to it:
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(1);
		list.add(3);
		
		// Adding a list to anoter list:
		List<Integer> linkedList = new LinkedList<>();
		linkedList.addAll(list);
		
		// Transformation from array to list:
		Integer[] ints = {6, 5, 4};
		list.addAll(Arrays.asList(ints));
		
		// Printing the list:
		for (Integer integer : list) {
			System.out.print(integer + ", ");
		}
		System.out.println();
		
		// Sorting:
		list.sort(Integer::compare);
		for (Integer integer : list) {
			System.out.print(integer + ", ");
		}
	}
}

/************************
 * Output:				*
 * 2, 1, 3, 6, 5, 4,	*
 * 1, 2, 3, 4, 5, 6,	*
 ************************/
