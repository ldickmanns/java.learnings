package utility;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

public class PostTemplateCreator {

	private static final String NL = "\n";
	private static final String SEPARATOR = NL + "---" + NL;
	
	public static void main(String[] args) {
		String greeting = "Hello fellow Devs! 👋🏼";
		
		for (int i = 19; i < 100	; i++) {
			String template = String.format("%03d", i);
			template += SEPARATOR;
			template += "Hello fellow Devs! 👋🏼" + NL + NL;
			template += ".\n" + 
					".\n" + 
					".\n" + 
					"Follow @java.learnings for more interesting Java content ♨💻\n" + 
					"Don't forget to tag your dev buddies! 👨🏼‍💻👩🏽‍💻\n" + 
					".\n" + 
					".\n" + 
					".\n" + 
					"#java #javaprogramming #javadeveloper #learnprogramming #programmer "
					+ "#programmerlife #programmerrepublic #programmers #programmerslife "
					+ "#programming #programminglife #programmingisfun #code #coding "
					+ "#codinglife #codingbootcamp #codingisfun #coder #coderlife "
					+ "#coders #softwaredeveloper #softwaredevelopers #softwaredevelopment "
					+ "#softwareengineer #softwareengineering #computerscience #dev "
					+ "#developer #developerlife #developers" + NL + SEPARATOR;
			System.out.println(template);
		}
	}
}
