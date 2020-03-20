package oop.concepts.encapsulation;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

public class ControlAccessModifiers {
	
	/**
	 * Private methods and attributes are only 
	 * accessible from the class, where they
	 * are declared.
	 */
	private String priv = "This is private!";
	
	/**
	 * Methods and attributes without a control
	 * access modifier can also be accessed from
	 * classes within the same package as the
	 * declaring class.
	 */
	String pdef = "This is accessible from "
			+ "the same package!";
	
	/**
	 * In addition to the accessibility of the two
	 * above, protected attributes and methods can
	 * be accesed from subclasses.
	 */
	protected String prot = "This is also accessible "
			+ "from subclasses";
	
	/**
	 * Public methods and fields can be accessed
	 * globally, which means the are visible from
	 * "everywhere".
	 */
	public String glob = "This is globally accessible";
}
