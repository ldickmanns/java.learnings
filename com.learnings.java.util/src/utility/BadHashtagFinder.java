package utility;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

import java.util.ArrayList;
import java.util.List;

public class BadHashtagFinder {

	private static List<String> good = new ArrayList<>();
	private static List<String> bad = new ArrayList<>();

	public static void main(String[] args) {
		String gs1 = "";
		String gs2 = "";
		String gs3 = "";
		String gs4 = "";

		addGoodTags(gs1);
		addGoodTags(gs2);
		addGoodTags(gs3);
		addGoodTags(gs4);

		String bs1 = "#appdevelopment #backend #code #coderlife #coders #codes #coding #computer #computerengineering #computers #devs #developer #developers #developerslife #frontend #javadeveloper #javajavajava #programmers #programmerslife #programminglanguage #programminglife #programminglove #softwaredevelopers #softwaredevelopment #softwareengineer #softwareengineering #softwarefollowers #technology #weprogrammers #worldcode";
		String bs2 = "#codegoals #coder #coders #coderslife #codes #codingbootcamp #codingdays #codinglife #codingpics #computerengineering #computers #devs #developerlife #developerslife #frontend #girlswhocode #javaprogramming #learnprogramming #linux #programmers #programmerslife #programminglanguage #programminglife #softwaredeveloper #softwaredevelopers #softwareengineer #softwarefollower #softwarefollowers #worldcode #💻";
//		String[] b1 = bs1.split(" ");
//		String[] b2 = bs2.split(" ");

//		List<String> bad = new ArrayList<>();
//		for (String string : b2) {
//			if (!good.contains(string))
//				bad.add(string);
//		}
//		bad.forEach(s -> System.out.print(s + " "));
		editBadTags(bs1);
		editBadTags(bs2);
		bad.forEach(s -> {
			if (!good.contains(s))
				System.out.println(s);
		});
	}
	
	private static void addGoodTags(String tags) {
		String[] tagsArr = tags.split(" ");
		for (String string : tagsArr) {
			if (!good.contains(string))
				good.add(string);
		}
	}

	private static void editBadTags(String tags) {
		String[] tagsArr = tags.split(" ");
		if (bad.isEmpty()) {
			for (String string : tagsArr) {
				if (!good.contains(string))
					bad.add(string);
			}
		} else {
			List<String> newBad = new ArrayList<>();
			for (String string : tagsArr) {
				if (bad.contains(string))
					newBad.add(string);
			}
			bad = newBad;
		}
	}
}
