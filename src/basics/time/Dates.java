package basics.time;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dates {

	public static void main(String[] args) {
		// The Date Class:
		Date date = new Date();
		// Printing the date:
		System.out.println(date.toString());
		
		// Formatting the Date:
		String pattern = "E dd.MM.yyyy";
		SimpleDateFormat format = 
				new SimpleDateFormat(pattern);
		System.out.println(format.format(date));
	}
}

/************************************
 * Output:							*
 * Thu Oct 10 16:55:51 CEST 2019	*
 * Thu 10.10.2019					*
 ************************************/
