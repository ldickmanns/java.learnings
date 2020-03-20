package oop.concepts.abstractclasses;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

public abstract class CompanyBuilding {
	
	/** Name of the building. */
	private String name;
	
	/** The company by which it is owned. */
	protected abstract String getOwner();
	
	/** Constructor. */
	public CompanyBuilding(String name) {
		this.name = name;
	}
	
	/** Information about the building. */
	public void printInformation() {
		System.out.println("The building " + name
				+ " is owned by " + getOwner() + ".");
	}
}
