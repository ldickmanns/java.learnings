package io;

import java.io.File;
import java.io.IOException;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

public class FileCreation {

	public static void main(String[] args) {
		File file = new File("myFile.txt");
		try {
			if (file.createNewFile()) {
				System.out.println("File created!");
			} else {
				System.out.println("File exists!");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

/********************
 * Output:			*
 * File created!	*
 * File exists!		*
 ********************/
