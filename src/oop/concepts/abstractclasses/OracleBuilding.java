package oop.concepts.abstractclasses;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

public class OracleBuilding extends CompanyBuilding {

	/** Constructor. */
	public OracleBuilding(String name) {
		super(name);
	}

	@Override
	protected String getOwner() {
		return "Oracle";
	}
}
