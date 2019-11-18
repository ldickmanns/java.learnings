package com.learnings.java.java8.streams;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Mapping {

	public static void main(String[] args) {
		List<Integer> ints = Arrays.asList(74, 97, 118,	97, 32,
				76,	101, 97, 114, 110, 105, 110, 103, 115);
		Stream<Character> stream = ints.stream().map(i -> {
			int primI = i;
			return (char)primI;
		});
		List<Character> chars = stream.collect(Collectors.toList());
		chars.forEach(c -> System.out.print(c));
	}	
}

/*******************
 * Output:		   *
 * Java Learinings *
 *******************/
