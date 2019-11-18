package com.learnings.java.oop;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

public class InstanceOf {

	public static void main(String[] args) {
		// Creating a Building and a House
		Building building = new Building();
		House house = new House();
		
		// Both are Buildings
		System.out.println(building instanceof Building);
		System.out.println(house instanceof Building);
		
		// House is a subtype of Building
		System.out.println(building instanceof House);
		System.out.println(house instanceof House);
	}
}

class Building {
	public Building() {
	}
}

class House extends Building{
	public House() {
	}
}

/************
 * Output:	*
 * true		*
 * true		*
 * false	*
 * true		*
 ************/
