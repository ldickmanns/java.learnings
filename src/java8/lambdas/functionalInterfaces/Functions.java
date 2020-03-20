package java8.lambdas.functionalInterfaces;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Functions {

	public static void main(String[] args) {
		Function<String[], String> concat = arr -> {
			String result = "";
			for (String string : arr) {
				result += string + " ";
			}
			return result;
		};
		String[] s = {"Hello", "fellow", "devs!"};
		System.out.println(concat.apply(s));
		
		Function<List<Integer>, Integer> sum = list -> {
			int result = 0;
			for (int i : list) {
				result += i;
			}
			return result;
		};
		List<Integer> l = Arrays.asList(3, 20, 100);
		System.out.println(sum.apply(l));
	}
}

/************************
 * Output:				*
 * Hello fellow devs!	*
 * 123					*
 ************************/
