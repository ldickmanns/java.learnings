package basics.properties;

import java.io.*;
import java.util.Properties;

/********************
 * Java Learnings   *
 * @java.learnings  *
 ********************/

public class PropertiesPersistency {

    public static void main(String[] args) {
        // Size of persons in cm
        Properties size = new Properties();
        size.setProperty("Lisa", "169");
        size.setProperty("Luke", "181");

        try {
            // Writing
            Writer writer = new FileWriter("prop.txt");
            size.store(writer, "Size of persons in cm");
            writer.close();

            // Reading
            Reader reader = new FileReader("prop.txt");
            Properties prop = new Properties();
            prop.load(reader);
            reader.close();

            // List properties
            prop.list(System.out);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}

/****************
 * Output:      *
 * Luke=181     *
 * Lisa=169     *
 ****************/

