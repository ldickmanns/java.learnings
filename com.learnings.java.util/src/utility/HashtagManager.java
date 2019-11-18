package utility;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class HashtagManager {

	private static final String[] hashtags = { "#appdeveloper", "#appdevelopment", "#backend",
//			"#buildupdevs",
			"#code", "#codegoals",
//			"#codelove",
			"#coder", "#coderlife",
//			"#coderpower",
			"#coders", "#coderslife", "#codes",
//			"#codeworld",
			"#coding", "#codingbootcamp", "#codingdays", "#codingisfun", "#codinglife", "#codingpics", "#computer",
			"#computerengineering", "#computers", "#computerscience", "#dev", "#devs", "#devlife", "#developer",
			"#developerlife", "#developers", "#developerslife", "#frontend", "#girlswhocode", "#java",
//			"#javacode",
			"#javadeveloper", "#javajavajava",
//			"#javalearning",
			"#javaprogramming",
//			"#javatutorial",
			"#learnprogramming", "#learntocode", "#linux", "#peoplewhocode", "#programmer", "#programmerlife",
			"#programmerrepublic", "#programmers", "#programmerslife", "#programming", 
//			"#programmings",
			"#programmingisfun", "#programminglanguage", "#programminglife", "#programminglove",
//			"#programmingtutorial",
			"#software", "#softwaredeveloper", "#softwaredevelopers", "#softwaredevelopment", "#softwareengineer",
			"#softwareengineering", "#softwarefollower", "#softwarefollowers", 
//			"#softwareinstagram", TODO
			"#tech",
			"#technology",
//			"#thedevlife",      TODO
			"#weprogrammers",
//			"#womenwhocode",
			"#worldcode", "#💻",
//			#100daysofcode
//			#nerd
//			#geek
	};

	private static final String[] pages = { "learningwithjarvis", "muji.codes", "_programmers.life", "programmer.me",
			"programer.life", "innovative_coder", "coding_rabbit_basics", "codepeople", "codingdays", "programmerplus",
			"ideadevelopers", "developers_team", "dev.space", "chmodxx", "thecodepage", "studentlearningpoint",
			"codemillionaire", "coder0302", "easysoftwaredeveloper", "jain_harsh21", "dev__elopers" };

	public static void main(String[] args) {
		// Tags for post
		System.out.println("Hello fellow devs! 👋🏼\n" +
				"\n" +
				".\n" + 
				".\n" + 
				".\n" + 
				"Follow @java.learnings for more interesting Java content ♨💻\n" + 
				"Don't forget to tag your dev buddies! 👨🏼‍💻👩🏽‍💻\n" + 
				".\n" + 
				".\n" + 
				".");
		printAmountOfArray(hashtags, 30);

		System.out.println();
		System.out.println();

		// Story sticker hashtag
		// System.out.println(hashtags[gen.nextInt(hashtags.length)]);

		// System.out.println();

		// Story hidden hashtags
		printAmountOfArray(hashtags, 9);

		System.out.println();
		System.out.println();

		// Tagged pages
		printAmountOfArray(pages, 10);

		// Stats
		// System.out.println();
		// System.out.println();
		// System.out.println(hashtags.length);
		// System.out.println(pages.length);
	}

	private static void printAmountOfArray(String[] pool, int amount) {
		Random gen = new Random();
		List<String> list = new ArrayList<>(Arrays.asList(pool));
		int toBeRemoved = pool.length - amount;
		for (int i = 0; i < toBeRemoved; i++) {
			int index = gen.nextInt(list.size());
			list.remove(index);
		}
		for (String string : list) {
			System.out.print(string + " ");
		}
	}

}
