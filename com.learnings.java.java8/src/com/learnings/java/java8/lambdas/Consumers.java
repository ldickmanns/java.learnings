package com.learnings.java.java8.lambdas;

import java.util.function.Consumer;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

public class Consumers {

	public static void main(String[] args) {
		Consumer<String> anonymous = new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.print(s);
			}
		};
		
		Consumer<String> lambda = s -> System.out.print(s);
		
		anonymous.accept("Java ");
		lambda.accept("Learnings");
	}
}

/*******************
 * Output:		   *
 * Java Learinings *
 *******************/
