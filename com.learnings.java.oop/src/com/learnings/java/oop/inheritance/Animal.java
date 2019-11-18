package com.learnings.java.oop.inheritance;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

public class Animal {

	protected String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void call() {
		System.out.println(name + "!");
	}
}
