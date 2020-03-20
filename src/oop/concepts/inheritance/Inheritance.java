package oop.concepts.inheritance;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

public class Inheritance {

	public static void main(String[] args) {
		// Animal
		Animal tiger = new Animal("Tiger");
		tiger.call();
		
		// Dog
		Dog dog = new Dog("Good boy");
		// Inherited method
		dog.call();
		// Extending method
		dog.bark();
	}
}

/****************
 * Output:		*
 * Tiger!		*
 * Good boy!	*
 * Woof-woof!	*
 ****************/
