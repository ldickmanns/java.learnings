package basics.properties;

import java.util.Properties;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

public class PropertiesUsage {

	public static void main(String[] args) {
		Properties prop = new Properties();
		
		prop.setProperty("user", "Alice");
		prop.setProperty("password", "Bob");
		System.out.println(prop.get("user"));
		System.out.println(prop.get("password"));
		
		System.out.println(prop.containsKey("user"));
		System.out.println(prop.containsValue("Alice"));
		
		prop.clear();
		System.out.println(prop.keySet().size());
	}
}

/************
 * Output:	*
 * Alice	*
 * Bob		*
 * true		*
 * true		*
 * 0		*
 ************/

