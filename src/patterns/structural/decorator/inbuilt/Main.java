package patterns.structural.decorator.inbuilt;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author ivanovaolyaa
 * @version 3/20/2018
 */
public class Main {

    public static void main(String[] args) {
        int c;

        try (InputStream in = new LowerCaseInputStream(new BufferedInputStream(new
                FileInputStream("decorator.txt")))) {

            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
