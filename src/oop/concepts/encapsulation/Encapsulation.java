package oop.concepts.encapsulation;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

public class Encapsulation {
	
	public static void main(String[] args) {
		// Creating a person:
		Person luke = new Person("Luke");
		// Read-only name:
		System.out.println(luke.getName());
		// Write-only age:
		luke.setAge(22);
		luke.printAge();
	}
}

class Person {
	private String name;
	private int age;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void printAge() {
		System.out.println(age);
	}
}

/************
 * Output:	*
 * Luke		*
 * 22		*
 ************/
