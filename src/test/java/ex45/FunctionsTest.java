package ex45;

import junit.framework.TestCase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FunctionsTest extends TestCase {

    public void testOutput() throws FileNotFoundException {
        String expect = "One should never use the word \"use\" in writing. Use \"use\" instead.\n" +
                "For example, \"She uses an IDE to write her Java programs\" instead of \"She\n" +
                "uses an IDE to write her Java programs\".\n";
        File inputFile = new File("src/main/java/ex45/exercise45_input.txt");
        Scanner input = new Scanner(inputFile);
        String value = Functions.output(input);
        assertEquals(expect, value);
    }
}