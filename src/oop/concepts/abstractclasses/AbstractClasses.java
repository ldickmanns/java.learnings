package oop.concepts.abstractclasses;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

public class AbstractClasses {
	public static void main(String[] args) {
		// Creating new buildings.
		OracleBuilding hq = 
				new OracleBuilding("Headquarter");
		OracleBuilding lab =
				new OracleBuilding("Lab");
		
		// Using the inherited method:
		hq.printInformation();
		lab.printInformation();
	}
}

/************************************************
 * Output:										*
 * The building Headquarter is owned by Oracle.	*
 * The building Lab is owned by Oracle.			*
 ************************************************/

