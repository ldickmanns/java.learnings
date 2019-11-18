package com.learnings.java.oop.inheritance;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

public class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}

	public void bark() {
		System.out.println("Woof-woof!");
	}
}
