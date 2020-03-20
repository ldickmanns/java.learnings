package basics.collections;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
	
	public static void main(String[] args) {
		// Holds the size for persons in cm
		Map<String, Integer> size = new HashMap<>();
		size.put("Alice", 171);
		size.put("Bob", 182);
		
		// Printing the names with the size
		for (String name : size.keySet()) {
			System.out.println(name + " is " 
					+ size.get(name) + "cm tall");
		}
	}
}

/************************
 * Output:				*
 * Bob is 182 cm tall	*
 * Alice is 171 cm tall	*
 ************************/
