package util;

import java.util.HashMap;
import java.util.Map;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

public class Tests {

	public static void main(String[] args) {
		int[] ar = {1, 2, 1, 2, 1};
		Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();
		for (int key : ar) {
			if (numMap.containsKey(key)) {
				int val = numMap.get(key);
				val++;
				numMap.put(key, val);
			} else {
				numMap.put(key, 1);
			}
		}
		int pairs = 0;
		for (int val : numMap.values()) {
			pairs += val / 2;
		}
		System.out.println(3 / 2);
	}
}
